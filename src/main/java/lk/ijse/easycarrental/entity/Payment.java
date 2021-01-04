package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    private String P_id;
    private String bank_slip;
    private double total_Payment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Customer_id", referencedColumnName = "Customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Rent_id", referencedColumnName = "r_ID", nullable = false)
    private Rental rental;

    public Payment() {
    }

    public Payment(String p_id, String bank_slip, double total_Payment, Customer customer, Rental rental) {
        P_id = p_id;
        this.bank_slip = bank_slip;
        this.total_Payment = total_Payment;
        this.customer = customer;
        this.rental = rental;
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

    @Override
    public String toString() {
        return super.toString();
    }

}
