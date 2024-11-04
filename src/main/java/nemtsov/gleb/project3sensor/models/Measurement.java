package nemtsov.gleb.project3sensor.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Measurement")
public class Measurement {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "value")
    private int value;

    @Column(name = "raining")
    private boolean raining;

    @ManyToOne
    @JoinColumn(name="sensor_id", referencedColumnName = "id")
    private Sensor owner;

    public Measurement() {}

    public Measurement(boolean raining, int value, Sensor owner) {
        this.raining = raining;
        this.value = value;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sensor getOwner() {
        return owner;
    }

    public void setOwner(Sensor owner) {
        this.owner = owner;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
