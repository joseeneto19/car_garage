package cars;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/criar")
    public CarModel createCar(@RequestBody CarModel carModel) {
        return carService.criarCar(carModel);
    }

    @GetMapping("/listar")
    public String listarCars() {
        return "Lista de cars";
    }
}
