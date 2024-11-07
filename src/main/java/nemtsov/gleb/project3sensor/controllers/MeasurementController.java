package nemtsov.gleb.project3sensor.controllers;

import nemtsov.gleb.project3sensor.models.Measurement;
import nemtsov.gleb.project3sensor.services.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

    private final MeasurementService measurementService;

    @Autowired
    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping()
    public List<Measurement> getMeasurements() {
        return measurementService.findAll();
    }

}
