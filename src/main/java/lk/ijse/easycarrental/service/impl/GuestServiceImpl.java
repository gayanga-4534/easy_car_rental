package lk.ijse.easycarrental.service.impl;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.entity.Customer;
import lk.ijse.easycarrental.repo.CarRepo;
import lk.ijse.easycarrental.repo.CustomerRepo;
import lk.ijse.easycarrental.service.GuestService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GuestServiceImpl implements GuestService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public String registerCustomer(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getCustomer_id())){
            Customer customer = mapper.map(customerDTO, Customer.class);
            customerRepo.save(customer);
            return "Customer added succefully...";
        }else{
            throw new RuntimeException("Oparation unsuccesful/ This NIC number already exits");
        }
    }

    @Override
    public List<Car> viewAllarshere() {
        List<Car> allCars = carRepo.findAll();
        return mapper.map(allCars, new TypeToken<List<CarDTO>>() {
        }.getType());
    }


}
