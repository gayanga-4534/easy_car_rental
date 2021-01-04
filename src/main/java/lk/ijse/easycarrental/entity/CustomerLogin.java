package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class CustomerLogin {

    @Id
    private String Customer_loginid;
    private String Customer_logdateandtime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Customer_Id", referencedColumnName = "Customer_id")
    private Customer customer;

    public CustomerLogin() {
    }

    public CustomerLogin(String customer_login, String customer_logdateandtime, Customer customer) {
        setCustomer_login(customer_login);
        setCustomer_logdateandtime(customer_logdateandtime);
        this.setCustomer(customer);
    }


    public String getCustomer_login() {
        return Customer_loginid;
    }

    public void setCustomer_login(String customer_login) {
        Customer_loginid = customer_login;
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
