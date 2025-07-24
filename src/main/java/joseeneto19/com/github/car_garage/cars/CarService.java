package joseeneto19.com.github.car_garage.cars;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;
    private CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public CarDTO createCar(CarDTO carDetails) {
        CarModel car = carMapper.map(carDetails);
        carRepository.save(car);
        return carMapper.map(car);
    }

    public List<CarModel> getAllCars() {
        return carRepository.findAll();
    }

    public CarModel getCarById(Long id) {
        Optional<CarModel> carModel = carRepository.findById(id);
        return carModel.orElse(null);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    public CarModel updateCar(Long id, CarModel carDetails) {
        if (carRepository.existsById(id)) {
            carDetails.setId(id);
            return carRepository.save(carDetails);
        } else {
            return null;
        }
    }
}
