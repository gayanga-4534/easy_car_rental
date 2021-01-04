package lk.ijse.easycarrental.repo;

import lk.ijse.easycarrental.dto.CustomerDTO;
import lk.ijse.easycarrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, String> {

    @Query(value = "select * from Customer where accept_status=false", nativeQuery = true)
    List<Customer> getonlyunVerifiedCustomers();

    @Query(value = "Update Customer set accept_status=true where Customer_id=:myID", nativeQuery = true)
    boolean updataCustomer(@Param("myID") String id);

}
