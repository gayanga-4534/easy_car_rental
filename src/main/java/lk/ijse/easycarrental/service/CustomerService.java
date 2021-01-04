package lk.ijse.easycarrental.service;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;
import lk.ijse.easycarrental.dto.RentalDTO;
import lk.ijse.easycarrental.entity.Car;

import java.util.List;

public interface CustomerService {
    String deleteCustomer(String id);

    String updateCustomer(CustomerDTO customerDTO);

    CustomerDTO logidCustomer(LoginDTO loginDTO);

    boolean RentaCar(RentalDTO rentalDTO);

    boolean updateCustomer2(CustomerDTO customerDTO);

    CustomerDTO searchCustomer(String email);

    List<CarDTO> getAllCars(CarDTO carDTO);
}
