package lk.ijse.easycarrental.service;

import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.entity.Car;

import java.util.List;

public interface GuestService {
    String registerCustomer(CustomerDTO customerDTO);

    List<Car> viewAllarshere();


}
