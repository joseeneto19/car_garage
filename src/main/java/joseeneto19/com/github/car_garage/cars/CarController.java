package joseeneto19.com.github.car_garage.cars;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createCar(@RequestBody CarDTO car) {
        CarDTO newCar = carService.createCar(car);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Car added successfully!" + "\n" +
                "Make: " +newCar.getMake() + "\n" +
                "Model: " +newCar.getModel() + "\n" +
                "License Plate: " +newCar.getLicensePlate());
    }

    @GetMapping("/list")
    public ResponseEntity<List<CarDTO>> listCars() {
        List<CarDTO> cars =  carService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<?> listCarById(@PathVariable Long id) {

        CarDTO car = carService.getCarById(id);

        if (car != null) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        if (carService.getCarById(id) != null) {
            carService.deleteCarById(id);
            return ResponseEntity.ok("Car deleted successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Car not found!");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> uptadeCar (@PathVariable Long id, @RequestBody CarDTO carDTO) {
        CarDTO car = carService.updateCar(id, carDTO);
        if (car != null) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
