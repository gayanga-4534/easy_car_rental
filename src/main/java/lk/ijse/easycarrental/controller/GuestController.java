package lk.ijse.easycarrental.controller;

import lk.ijse.easycarrental.dto.CarDTO;
import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.entity.Car;
import lk.ijse.easycarrental.service.GuestService;
import lk.ijse.easycarrental.utill.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/guest/")
@CrossOrigin
public class GuestController {

    @Autowired
    GuestService guestService;

    @PostMapping(path = "m1",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity registerCustomer(@RequestBody CustomerDTO customerDTO){
        String s = guestService.registerCustomer(customerDTO);
        StandradResponse sr=new StandradResponse(200,"Success", s);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity viewAllustomers(){
        List<Car> cars = guestService.viewAllarshere();
        StandradResponse sr=new StandradResponse(200,"Success", cars);
        return new ResponseEntity(sr, HttpStatus.CREATED);
    }
}
