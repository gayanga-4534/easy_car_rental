package lk.ijse.easycarrental.dto;

import lk.ijse.easycarrental.entity.Customer;

public class CustomerLoginDTO {
    private String Customer_login;
    private String Customer_logdateandtime;
    private Customer customer;

    public CustomerLoginDTO() {
    }

    public CustomerLoginDTO(String customer_login, String customer_logdateandtime, Customer customer) {
        Customer_login = customer_login;
        Customer_logdateandtime = customer_logdateandtime;
        this.customer = customer;
    }

    public String getCustomer_login() {
        return Customer_login;
    }

    public void setCustomer_login(String customer_login) {
        Customer_login = customer_login;
    }

    public String getCustomer_logdateandtime() {
        return Customer_logdateandtime;
    }

    public void setCustomer_logdateandtime(String customer_logdateandtime) {
        Customer_logdateandtime = customer_logdateandtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
