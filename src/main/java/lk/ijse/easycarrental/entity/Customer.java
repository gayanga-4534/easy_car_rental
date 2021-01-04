package lk.ijse.easycarrental.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String Customer_id;
    private String Cus_name;
    private String Cus_NIC;
    private String Password;
    private String DateandTime;
    private boolean accept_status;
    private int Contact_num;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Rental> rentals=new ArrayList<Rental>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Payment> listPayment=new ArrayList<Payment>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerLogin> listOfCusLogin=new ArrayList<CustomerLogin>();

    public Customer() {
    }

    public Customer(String customer_id) {
        Customer_id = customer_id;
    }

    public Customer(String customer_id, String cus_name, String cus_NIC, String password, String dateandTime, boolean accept_status, int Contactnum) {
        Customer_id = customer_id;
        Cus_name = cus_name;
        Cus_NIC = cus_NIC;
        Password = password;
        DateandTime = dateandTime;
        this.accept_status = accept_status;
        this.Contact_num=Contactnum;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<Payment> getListPayment() {
        return listPayment;
    }

    public void setListPayment(List<Payment> listPayment) {
        this.listPayment = listPayment;
    }

    public String getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(String customer_id) {
        Customer_id = customer_id;
    }

    public String getCus_name() {
        return Cus_name;
    }

    public void setCus_name(String cus_name) {
        Cus_name = cus_name;
    }

    public String getCus_NIC() {
        return Cus_NIC;
    }

    public void setCus_NIC(String cus_NIC) {
        Cus_NIC = cus_NIC;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDateandTime() {
        return DateandTime;
    }

    public void setDateandTime(String dateandTime) {
        DateandTime = dateandTime;
    }

    public boolean isAccept_status() {
        return accept_status;
    }

    public void setAccept_status(boolean accept_status) {
        this.accept_status = accept_status;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getContact_num() {
        return Contact_num;
    }

    public void setContact_num(int contact_num) {
        Contact_num = contact_num;
    }
}
