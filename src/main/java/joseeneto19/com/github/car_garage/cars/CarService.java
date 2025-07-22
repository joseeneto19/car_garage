package cars;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarModel criarCar(CarModel carModel) {
        return carRepository.save(carModel);
    }
}
