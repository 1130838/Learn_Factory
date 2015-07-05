package myapp.aplication;

import myapp.domain.Car;
import myapp.persistence.CarRepository;
import myapp.persistence.Persistence;

import java.util.List;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class ListCarsController {

    public List<Car> getAllCars(){

        CarRepository repo = Persistence.getRepositoryFactory().getCarRepository();
        List<Car> carList = repo.all();
        return carList;
    }
}
