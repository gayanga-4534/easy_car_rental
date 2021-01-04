package lk.ijse.easycarrental.service;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;

import java.util.List;

public interface AdminService {
    boolean loginCustomer(LoginDTO loginDTO);
    String addNewCar(CarDTO car);
    String updateCar(CarDTO car);
    String deleteCar(String id);
    CarDTO searchCar(String id);
    List<CarDTO> getAllCars();

    void addtomaintainence(CarDTO carDTO);

    List<CustomerDTO> getAllUnverifiedCustomers();

}
