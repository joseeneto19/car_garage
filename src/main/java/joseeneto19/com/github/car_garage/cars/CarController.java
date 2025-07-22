package joseeneto19.com.github.car_garage.cars;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list")
    public List<CarModel> listCars() {
        return carService.getAllCars();
    }

    @GetMapping("/list/{id}")
    public CarModel listCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCarById(id);
    }
}
