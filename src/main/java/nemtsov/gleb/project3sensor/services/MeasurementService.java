package nemtsov.gleb.project3sensor.services;

import nemtsov.gleb.project3sensor.models.Measurement;
import nemtsov.gleb.project3sensor.models.Sensor;
import nemtsov.gleb.project3sensor.repositories.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MeasurementService {

    private final MeasurementRepository measurementRepository;
    private final SensorService sensorService;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository, SensorService sensorService) {
        this.measurementRepository = measurementRepository;
        this.sensorService = sensorService;
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    public int countAllRainyDays() {
        return measurementRepository.countMeasurementByRaining(true);
    }

    public void save(Measurement measurement) {
        // Найти сенсор в базе данных по имени
        Sensor sensor = sensorService.findByName(measurement.getOwner().getName());

        if (sensor == null) {
            throw new IllegalArgumentException("Sensor with name '" + measurement.getOwner().getName() + "' does not exist");
        }

        // Установить найденный сенсор как владельца
        measurement.setOwner(sensor);
        enrichMeasurement(measurement);
        measurementRepository.save(measurement);
    }

    public void enrichMeasurement(Measurement measurement) {
        measurement.setCreatedAt(LocalDateTime.now());
        measurement.setSensorName(measurement.getOwner().getName());
    }

}
