package lk.ijse.easycarrental.service.impl;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.entity.Customer;
import lk.ijse.easycarrental.prefarences.Preferances;
import lk.ijse.easycarrental.repo.CarRepo;
import lk.ijse.easycarrental.repo.CustomerRepo;
import lk.ijse.easycarrental.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdminServiceimpl implements AdminService{

    @Autowired
    CarRepo carRepo;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    private Preferances preferances=Preferances.getInstance();

    @Override
    public boolean loginCustomer(LoginDTO loginDTO) {
        if (loginDTO.getUsername().equals(preferances.getUserName()) &
                loginDTO.getPassword().equals(preferances.getPassword())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String addNewCar(CarDTO car) {
        if (!carRepo.existsById(car.getReg_num())){
            Car car1=modelMapper.map(car, Car.class);
            carRepo.save(car1);
            return "Car added successfull";
        }else{
            throw new RuntimeException("This reg Number is already exits...");
        }
    }

    @Override
    public String updateCar(CarDTO car) {
        if (carRepo.existsById(car.getReg_num())){
            Car car1=modelMapper.map(car, Car.class);
            carRepo.save(car1);
            return "Car update successfull";
        }else{
            throw new RuntimeException("No such a Customer avalible...");
        }
    }

    @Override
    public String deleteCar(String id) {
        if(carRepo.existsById(id)){
            carRepo.deleteById(id);
            return "Car delete successfull";
        }else{
            throw new RuntimeException("No car for delete ID: " + id);
        }
    }

    @Override
    public CarDTO searchCar(String id) {
        Optional<Car> car = carRepo.findById(id);
        if (car.isPresent()){
            return modelMapper.map(car.get(), CarDTO.class);
        }else {
            throw new RuntimeException("No customer for id: " + id);
        }
    }

    @Override
    public List<CarDTO> getAllCars() {
        List<Car> carList = carRepo.findAll();
        return modelMapper.map(carList, new TypeToken<List<CarDTO>>(){
        }.getType());
    }

    @Override
    public void addtomaintainence(CarDTO carDTO) {
        if (carRepo.existsById(carDTO.getReg_num())){
            Car car2 = modelMapper.map(carDTO, Car.class);
            carRepo.save(car2);
        }else{
            throw new RuntimeException("Oparation unsuccesful Please select a valid car");
        }
    }

    @Override
    public List<CustomerDTO> getAllUnverifiedCustomers() {
        List<Customer> allCustomerList = customerRepo.getonlyunVerifiedCustomers();
        return modelMapper.map(allCustomerList, new TypeToken<List<CustomerDTO>>(){
        }.getType());
    }

}
