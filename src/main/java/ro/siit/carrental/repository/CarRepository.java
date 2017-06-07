package ro.siit.carrental.repository;

import ro.siit.carrental.domain.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Florina Szasz on 6/7/2017.
 */
public class CarRepository {

    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
