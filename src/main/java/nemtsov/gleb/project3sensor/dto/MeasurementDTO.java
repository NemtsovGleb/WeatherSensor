package nemtsov.gleb.project3sensor.dto;

import jakarta.validation.constraints.*;
import nemtsov.gleb.project3sensor.models.Sensor;

public class MeasurementDTO {

    @Min(-100)
    @Max(100)
    private int value;

    @NotNull
    private boolean raining;

    @NotNull
    private Sensor sensor;

    @NotNull
    public boolean isRaining() {
        return raining;
    }

    public void setRaining(@NotNull boolean raining) {
        this.raining = raining;
    }

    public @NotNull Sensor getSensor() {
        return sensor;
    }

    public void setSensor(@NotNull Sensor sensor) {
        this.sensor = sensor;
    }


    @Min(-100)
    @Max(100)
    public int getValue() {
        return value;
    }

    public void setValue(@Min(-100) @Max(100) int value) {
        this.value = value;
    }
}
