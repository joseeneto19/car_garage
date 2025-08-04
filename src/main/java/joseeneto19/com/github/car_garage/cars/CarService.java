package joseeneto19.com.github.car_garage.cars;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<CarDTO> getAllCars() {
        List<CarModel> cars = carRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        return cars.stream()
                .map(carMapper::map)
                .collect(Collectors.toList());
    }

    public CarDTO getCarById(Long id) {
        Optional<CarModel> carModel = carRepository.findById(id);
        return carModel.map(carMapper::map).orElse(null);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    public CarDTO updateCar(Long id, CarDTO carDTO) {
        Optional<CarModel> carById = carRepository.findById(id);
        if (carById.isPresent()) {
            CarModel carEdited = carMapper.map(carDTO);
            carEdited.setId(id);
            CarModel carSave = carRepository.save(carEdited);
            return carMapper.map(carSave);
        } else {
            return null;
        }
    }
}
