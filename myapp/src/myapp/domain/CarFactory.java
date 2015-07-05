package myapp.domain;

/**
 * Created by bruno.devesa on 05-07-2015.
 */
public class CarFactory {

    public static Car buildCar(CarType model){
    Car car = null;
        switch (model){
            case SMALL:
                car = new SmallCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
        }
        return car;
    }
}
