package nemtsov.gleb.project3sensor.repositories;

import nemtsov.gleb.project3sensor.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {

    Sensor findByName(String name);
}
