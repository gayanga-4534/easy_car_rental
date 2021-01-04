package lk.ijse.easycarrental.dto;

import lk.ijse.easycarrental.entity.Customer;

public class DriverLoginDTO {
    private String Customer_loginid;
    private String Customer_logdateandtime;
    private Customer customer;

    public DriverLoginDTO(String customer_loginid, String customer_logdateandtime, Customer customer) {
        Customer_loginid = customer_loginid;
        Customer_logdateandtime = customer_logdateandtime;
        this.customer = customer;
    }

    public DriverLoginDTO() {
    }

    public String getCustomer_loginid() {
        return Customer_loginid;
    }

    public void setCustomer_loginid(String customer_loginid) {
        Customer_loginid = customer_loginid;
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
