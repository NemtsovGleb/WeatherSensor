package nemtsov.gleb.project3sensor.util;

import nemtsov.gleb.project3sensor.dto.SensorDTO;
import nemtsov.gleb.project3sensor.models.Measurement;
import nemtsov.gleb.project3sensor.models.Sensor;
import nemtsov.gleb.project3sensor.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Set;

@Component
public class SensorValidator implements Validator {

    SensorService sensorService;

    @Autowired
    public SensorValidator(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Sensor sensor = (Sensor) o;

        if(sensorService.findByName(sensor.getName()) != null)
            errors.rejectValue("name", "", "This name is already taken");

    }

    public void validateForMeasurement(Measurement measurement, Errors errors) {
        String name = sensorService.findByName(measurement.getOwner().getName()).getName();
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Sensor not found");
    }


}
