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
    public CarDTO createCar(@RequestBody CarDTO carDTO) {
        return carService.createCar(carDTO);
    }

    @GetMapping("/list")
    public List<CarDTO> listCars() {
        return carService.getAllCars();
    }

    @GetMapping("/list/{id}")
    public CarDTO listCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCarById(id);
    }

    @PutMapping("/update/{id}")
    public CarDTO uptadeCar (@PathVariable Long id, @RequestBody CarDTO carDTO) {
        return carService.updateCar(id, carDTO);
    }
}
