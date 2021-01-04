package lk.ijse.easycarrental.dto;

import lk.ijse.easycarrental.entity.Customer;
import lk.ijse.easycarrental.entity.Rental;

public class PaymentDTO {
    private String P_id;
    private String bank_slip;
    private double total_Payment;

    private Customer customer;
    private Rental rental;

    public PaymentDTO() {
    }

    public PaymentDTO(String p_id, String bank_slip, double total_Payment, Customer customer, Rental rental) {
        setP_id(p_id);
        this.setBank_slip(bank_slip);
        this.setTotal_Payment(total_Payment);
        this.setCustomer(customer);
        this.setRental(rental);
    }


    public String getP_id() {
        return P_id;
    }

    public void setP_id(String p_id) {
        P_id = p_id;
    }

    public String getBank_slip() {
        return bank_slip;
    }

    public void setBank_slip(String bank_slip) {
        this.bank_slip = bank_slip;
    }

    public double getTotal_Payment() {
        return total_Payment;
    }

    public void setTotal_Payment(double total_Payment) {
        this.total_Payment = total_Payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
