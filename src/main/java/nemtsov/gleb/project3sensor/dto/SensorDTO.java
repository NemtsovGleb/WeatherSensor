package nemtsov.gleb.project3sensor.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class SensorDTO {

    @NotEmpty(message = "Name should not be empty")
    @Size(min =2, max = 30, message = "Name should be between 2 and 30")
    private String name;

    public @NotEmpty(message = "Name should not be empty") @Size(min = 2, max = 30, message = "Name should be between 2 and 30") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name should not be empty") @Size(min = 2, max = 30, message = "Name should be between 2 and 30") String name) {
        this.name = name;
    }


}
