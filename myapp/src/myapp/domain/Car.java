package myapp.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Car implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long carId;

    private String brand;
    private int horsePower;

    private CarType model;

    public Car() {
        // for ORM purposes
    }

    public Car(String brand, int horsePower, CarType model) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.model = model;
    }


    public abstract void riding();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                ", model=" + model +
                '}';
    }
}
