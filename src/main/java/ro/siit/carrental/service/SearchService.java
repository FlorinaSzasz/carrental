package ro.siit.carrental.service;

import ro.siit.carrental.domain.Car;
import ro.siit.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Florina Szasz on 6/7/2017.
 */
public class SearchService {

    private CarRepository carRepository;

    public SearchService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getCars()) {
            if (car.getMake().equals(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Car> findCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getCars()) {
            if (car.getMake().equals(make) && car.getModel().equals(model)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Car> findCarsByMultipleChars(String make, String model, String fuelType, int producingYear) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getCars()) {
            if (car.getMake().equals(make) && car.getModel().equals(model) && car.getFuelType().equals(fuelType) &&
                    car.getProducingYear() == producingYear) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

}

