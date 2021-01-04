package lk.ijse.easycarrental.repo;

import lk.ijse.easycarrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarRepo extends JpaRepository<Car, String>{

    @Query(value = "select * from Car where type=:cartype and numberofpass<=:numofpassengers and transmission_type=:" +
            "tratype and dailyrate<=:dailyrate and brand=:brand and fuelType=:fueltype", nativeQuery = true)
    List<Car> findAllavalible(@Param("cartype") String cartype, @Param("numofpassengers")
            int numofpassengers, @Param("tratype") String tratype, @Param("dailyrate") double dailyprice,
                              @Param("brand") String brand, @Param("fueltype") String fueltype);

}
