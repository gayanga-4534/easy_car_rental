package lk.ijse.easycarrental.repo;

import lk.ijse.easycarrental.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepo extends JpaRepository<Rental,String>{
}
