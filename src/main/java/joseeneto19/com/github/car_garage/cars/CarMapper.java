package joseeneto19.com.github.car_garage.cars;

import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarModel map(CarDTO carDTO) {
        CarModel carModel = new CarModel();
        carModel.setId(carDTO.getId());
        carModel.setMake(carDTO.getMake());
        carModel.setModel(carDTO.getModel());
        carModel.setManufactureYear(carDTO.getManufactureYear());
        carModel.setColor(carDTO.getColor());
        carModel.setLicensePlate(carDTO.getLicensePlate());
        carModel.setStatus(carDTO.getStatus());

        return carModel;
    }

    public CarDTO map(CarModel carModel) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(carModel.getId());
        carDTO.setMake(carModel.getMake());
        carDTO.setModel(carModel.getModel());
        carDTO.setManufactureYear(carModel.getManufactureYear());
        carDTO.setColor(carModel.getColor());
        carDTO.setLicensePlate(carModel.getLicensePlate());
        carDTO.setStatus(carModel.getStatus());
        return carDTO;

    }





}
