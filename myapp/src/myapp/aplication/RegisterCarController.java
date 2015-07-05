package myapp.aplication;

import myapp.domain.Car;
import myapp.domain.CarFactory;
import myapp.domain.CarType;
import myapp.persistence.Persistence;
import myapp.persistence.CarRepository;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class RegisterCarController {

    public void registerCar(String brand, int horsePower, CarType model) {

//        creating a new car with Factory
        Car c1 = CarFactory.buildCar(model);
        c1.setBrand(brand);
        c1.setHorsePower(horsePower);
        c1.setModel(model);

        CarRepository repo = Persistence.getRepositoryFactory().getCarRepository();
        repo.add(c1);

    }
}
