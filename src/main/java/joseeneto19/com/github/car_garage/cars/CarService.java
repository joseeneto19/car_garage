package joseeneto19.com.github.car_garage.cars;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarModel createCar(CarModel carModel) {
        return carRepository.save(carModel);
    }
}
