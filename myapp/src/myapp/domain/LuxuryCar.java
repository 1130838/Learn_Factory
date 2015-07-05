package myapp.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bruno.devesa on 05-07-2015.
 */
@Entity
public class LuxuryCar extends Car implements Serializable {

    public LuxuryCar() {
//        for ORM purpuses
    }


    public LuxuryCar(String brand, int horsePower) {
        super(brand, horsePower, CarType.LUXURY);
    }

    @Override
    public void riding() {
        System.out.println("hello im driving a luxury car");
    }
}
