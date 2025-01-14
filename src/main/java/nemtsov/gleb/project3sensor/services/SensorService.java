package nemtsov.gleb.project3sensor.services;

import nemtsov.gleb.project3sensor.dto.SensorDTO;
import nemtsov.gleb.project3sensor.models.Sensor;
import nemtsov.gleb.project3sensor.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> findAll() {return sensorRepository.findAll();}

    public void save(Sensor sensor) {
        sensorRepository.save(sensor);
    }

//    public void save(SensorDTO sensor) {
//        enrichSensor(sensor);
//        sensorRepository.save(sensor);
//    }

    private void enrichSensor(SensorDTO sensor) {}
}
