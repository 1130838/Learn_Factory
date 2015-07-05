package myapp.persistence;

import myapp.domain.Car;

import java.util.List;

/**
 * Created by brunodevesa on 16/04/15.
 */
public interface CarRepository {

	boolean add(Car entity);

	long size();

	List<Car> all();

}
