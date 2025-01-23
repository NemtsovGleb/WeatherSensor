package nemtsov.gleb.project3sensor.repositories;

import nemtsov.gleb.project3sensor.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    int countMeasurementByRaining(boolean raining);
}
