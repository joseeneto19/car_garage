package joseeneto19.com.github.car_garage.cars;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/create")
    public CarModel createCar(@RequestBody CarModel carModel) {
        return carService.createCar(carModel);
    }
}
