package lk.ijse.easycarrental.controller;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.dto.LoginDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.service.AdminService;
import lk.ijse.easycarrental.service.CustomerService;
import lk.ijse.easycarrental.utill.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    CustomerService customerService;

    @PostMapping(path = "m1",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity loginAdmin(@RequestBody LoginDTO loginDTO){
        boolean b = adminService.loginCustomer(loginDTO);
        StandradResponse sR=new StandradResponse(200,"Success",b);
        return new ResponseEntity(sR, HttpStatus.CREATED);
    }

    @PostMapping(path = "m2", consumes ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addNewCar(@RequestBody CarDTO carDTO){
        String s = adminService.addNewCar(carDTO);
        StandradResponse sR=new StandradResponse(200,"Success",s);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m3", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity updateCar(@RequestBody CarDTO carDTO){
        String s = adminService.updateCar(carDTO);
        StandradResponse sR=new StandradResponse(200,"Success",s);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m4", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity deleteCar(@RequestBody CarDTO carDTO){
        String s = adminService.deleteCar(carDTO.getReg_num());
        StandradResponse sR=new StandradResponse(200,"Success", s);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m5", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity searchCar(@RequestBody CarDTO carDTO){
        CarDTO carDTO1 = adminService.searchCar(carDTO.getReg_num());
        StandradResponse sR=new StandradResponse(200,"Success", carDTO1);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @GetMapping(path = "m6")
    public ResponseEntity searchAllCar(){
        List<CarDTO> allCars = adminService.getAllCars();
        StandradResponse sR=new StandradResponse(200,"Success", allCars);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @GetMapping(path = "m8", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity findbyProperties(@RequestBody CustomDTO customDTO){
        List<CarDTO> carRegNumber=new ArrayList<>();
        List<CarDTO> allCars = adminService.getAllCars();
        int rStatus=0;
        for (int i=0; i<allCars.size(); i++){
            rStatus=0;
            if (allCars.get(i).getType().equals(customDTO.getType())){
                rStatus+=1;
                if (allCars.get(i).getTransmission_type().equals(customDTO.getTransmission_type())){
                    rStatus+=1;
                    if (allCars.get(i).getNumberofpass()==(customDTO.getNumberofpass())){
                        rStatus+=1;
                        if (allCars.get(i).getDailyrate()==(customDTO.getDailyrate())){
                            rStatus+=1;
                            if (allCars.get(i).getBrand().equals(customDTO.getBrand())){
                                rStatus+=1;
                                if (allCars.get(i).getFuelType().equals(customDTO.getFuelType())){
                                    rStatus+=1;
                                }
                            }
                        }
                    }
                }
            }
            if (rStatus==6){
                carRegNumber.add(allCars.get(i));
            }
        }
        StandradResponse sR=new StandradResponse(200,"Success", carRegNumber);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m7", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addtoMaintainence(@RequestBody CarDTO carDTO){
        adminService.addtomaintainence(carDTO);
        StandradResponse sR=new StandradResponse(200,"Success", null);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @GetMapping(path = "m9")
    public ResponseEntity getAllCustomers(){
        List<CustomerDTO> allCustomers = adminService.getAllUnverifiedCustomers();
        StandradResponse sR=new StandradResponse(200,"Success", allCustomers);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m10", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity verifyCustomer(@RequestBody CustomerDTO customerDTO){
        boolean b = customerService.updateCustomer2(customerDTO);
        StandradResponse sR=new StandradResponse(200,"Success", b);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }

    @PostMapping(path = "m11", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO customerDTO1 = customerService.searchCustomer(customerDTO.getCustomer_id());
        StandradResponse sR=new StandradResponse(200,"Success", customerDTO1);
        return new ResponseEntity(sR,HttpStatus.CREATED);
    }


}
