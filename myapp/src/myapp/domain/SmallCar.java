package myapp.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bruno.devesa on 05-07-2015.
 */
@Entity
public class SmallCar extends Car implements Serializable{

    public SmallCar() {
    }

    public SmallCar(String brand, int horsePower) {
        super(brand, horsePower, CarType.SMALL);
    }

    @Override
    public void riding() {
        System.out.println("hello im driving a small car");
    }
}
