package cars;

import enums.CarStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cars")
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

    public CarModel() {
    }

    public CarModel(String make, String model, Integer manufactureYear, String color, String licensePlate, CarStatus status) {
        this.make = make;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.licensePlate = licensePlate;
        this.status = status;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }
}
