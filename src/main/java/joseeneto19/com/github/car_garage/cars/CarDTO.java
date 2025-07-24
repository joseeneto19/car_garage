package joseeneto19.com.github.car_garage.cars;

import jakarta.persistence.*;
import joseeneto19.com.github.car_garage.cars.enums.CarStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class CarDTO {

    private Long id;
    private String make;
    private String model;
    private Integer manufactureYear;
    private String color;
    private String licensePlate;
    @Enumerated(EnumType.STRING)
    private CarStatus status;
}
