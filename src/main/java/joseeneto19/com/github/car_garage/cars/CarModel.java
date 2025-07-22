package joseeneto19.com.github.car_garage.cars;

import joseeneto19.com.github.car_garage.cars.enums.CarStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cars")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    @Column(name = "manufacture_year")
    private Integer manufactureYear;
    private String color;
    @Column(unique = true, name = "license_plate")
    private String licensePlate;
    @Enumerated(EnumType.STRING)
    private CarStatus status;
}
