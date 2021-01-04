package lk.ijse.easycarrental.service.impl;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;
import lk.ijse.easycarrental.dto.RentalDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.entity.Customer;
import lk.ijse.easycarrental.entity.Rental;
import lk.ijse.easycarrental.repo.CarRepo;
import lk.ijse.easycarrental.repo.CustomerRepo;
import lk.ijse.easycarrental.repo.RentalRepo;
import lk.ijse.easycarrental.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    RentalRepo rentalRepo;

    @Autowired
    CarRepo carRepo;

    @Override
    public String deleteCustomer(String id) {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
            return "Deleted Success...";
        }else{
            throw new RuntimeException("No customer for delete ID: " + id);
        }
    }

    @Override
    public String updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getCustomer_id())){
            Customer map = mapper.map(customerDTO, Customer.class);
            customerRepo.save(map);
            return "Updated Customer...";
        }else{
            throw new RuntimeException("No customer for delete ID: " + customerDTO.getCustomer_id());
        }
    }

    @Override
    public CustomerDTO logidCustomer(LoginDTO loginDTO) {
        Optional<Customer> cus = customerRepo.findById(loginDTO.getUsername());
        if(cus.isPresent()){
            Customer customerEntity = mapper.map(cus.get(), Customer.class);
            if (customerEntity.getPassword().equals(loginDTO.getPassword())){
                CustomerDTO map = mapper.map(customerEntity, CustomerDTO.class);
                return map;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public boolean RentaCar(RentalDTO rentalDTO) {
        if (true){
            Rental rental = mapper.map(rentalDTO, Rental.class);
            rentalRepo.save(rental);
            return true;
        }else{
            throw new RuntimeException("Rent unsuccessful...");
        }

    }

    @Override
    public boolean updateCustomer2(CustomerDTO customerDTO) {
        if (true){
            boolean b = customerRepo.updataCustomer("QQQ");
            return true;
        }else{
            throw new RuntimeException("verification unsuccessful...");
        }
    }

    @Override
    public CustomerDTO searchCustomer(String email) {
        if (customerRepo.existsById(email)){
            Optional<Customer> customer = customerRepo.findById(email);
            return mapper.map(customer.get(), CustomerDTO.class);
        }else{
            throw new RuntimeException("Can not load Customer");
        }
    }

    @Override
    public List<CarDTO> getAllCars(CarDTO carDTO) {
        List<Car> allavalible = carRepo.findAllavalible(carDTO.getType(), carDTO.getNumberofpass(), carDTO.getTransmission_type(),
                carDTO.getDailyrate(), carDTO.getBrand(), carDTO.getFuelType());
        List<CarDTO> allAviliblecars=new ArrayList<>();
        for(Car car1:allavalible){
            allAviliblecars.add(mapper.map(car1, CarDTO.class));
        }
        System.out.println(allAviliblecars.get(0).toString());
        return allAviliblecars;
    }

}
