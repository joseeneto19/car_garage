package cars;

import enums.CarStatus;
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
    private Integer manufactureYear;
    private String color;
    private String licensePlate;
    private CarStatus status;
}
