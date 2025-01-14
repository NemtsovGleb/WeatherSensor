//package nemtsov.gleb.project3sensor.util;
//
//import nemtsov.gleb.project3sensor.dto.SensorDTO;
//import nemtsov.gleb.project3sensor.models.Sensor;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//import java.util.Set;
//
//@Component
//public class SensorValidator implements Validator {
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        SensorDTO sensor = (SensorDTO) o;
//
//        if(SensorDTO.show(sensor.getName().isPresent()))
//            errors.rejectValue("email", "", "This email is already taken");
//    }
//
//
//}
