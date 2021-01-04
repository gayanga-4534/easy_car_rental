package lk.ijse.easycarrental.controller;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;
import lk.ijse.easycarrental.dto.RentalDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.service.CustomerService;
import lk.ijse.easycarrental.utill.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer/")
@CrossOrigin
public class Customerontroller {

    @Autowired
    CustomerService customerService;

    String email;

    @PostMapping(path = "m1", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity deleteCustomer(@RequestBody CustomerDTO customerDTO){
        String s = customerService.deleteCustomer(customerDTO.getCustomer_id());
        StandradResponse sr=new StandradResponse(200,"Success", s);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @PostMapping(path = "m2", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO customerDTO){
        String s = customerService.updateCustomer(customerDTO);
        StandradResponse sr=new StandradResponse(200,"Success", s);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity loginCustomer(@RequestBody LoginDTO loginDTO){
        email=loginDTO.getUsername();
        CustomerDTO customerDTO = customerService.logidCustomer(loginDTO);
        StandradResponse sr=new StandradResponse(200,"Success", customerDTO.isAccept_status());
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @PostMapping(path = "m4", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity rentAcar(@RequestBody RentalDTO rentalDTO){
        boolean b = customerService.RentaCar(rentalDTO);
        StandradResponse sr=new StandradResponse(200,"Success", b);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @GetMapping(path = "m5", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getCustomerEmail(){
        StandradResponse sr=new StandradResponse(200,"Success", email);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @PostMapping(path = "m6", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getAllCars(@RequestBody CarDTO carDTO){
        List<CarDTO> allCars = customerService.getAllCars(carDTO);
        StandradResponse sr=new StandradResponse(200,"Success", allCars);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

}
