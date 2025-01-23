package nemtsov.gleb.project3sensor;

import nemtsov.gleb.project3sensor.dto.MeasurementDTO;
import nemtsov.gleb.project3sensor.models.Measurement;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project3SensorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project3SensorApplication.class, args);
    }


    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Настройка маппинга для вложенного объекта Sensor
        modelMapper.typeMap(MeasurementDTO.class, Measurement.class).addMappings(mapper ->
                mapper.map(MeasurementDTO::getSensor, Measurement::setOwner)
        );

        return modelMapper;
    }


}
