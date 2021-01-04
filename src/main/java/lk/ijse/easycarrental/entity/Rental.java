package lk.ijse.easycarrental.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rental {

    @Id
    private String r_ID;
    private String pickUpVenue;
    private String return_venue;
    private boolean request_Status;
    private String pickupdate;
    private boolean driverStatus;
    private String returndate;
    private String rent_date;

    private String returneddate;
    private String returned_venue;
    private double rent_total;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Customer_id", referencedColumnName = "Customer_id", nullable = false)
    private Customer customer;

    @ManyToMany(mappedBy = "rentalList",cascade = CascadeType.ALL)
    private List<Car> listA=new ArrayList<Car>();

    @ManyToMany(mappedBy = "listRent", cascade = CascadeType.ALL)
    private List<Driver> listDrivers=new ArrayList<Driver>();

    @OneToMany(mappedBy = "rental", cascade = CascadeType.ALL)
    private List<Payment> listOfPayment=new ArrayList<Payment>();

    public Rental() {
    }

    public Rental(String r_ID, String pickUpVenue, String return_venue, boolean request_Status, String pickupdate, boolean driverStatus, String returndate, String rent_date, String returneddate, String returned_venue, double rent_total, Customer customer) {
        this.setR_ID(r_ID);
        this.setPickUpVenue(pickUpVenue);
        this.setReturn_venue(return_venue);
        this.setRequest_Status(request_Status);
        this.setPickupdate(pickupdate);
        this.setDriverStatus(driverStatus);
        this.setReturndate(returndate);
        this.setRent_date(rent_date);
        this.setReturneddate(returneddate);
        this.setReturned_venue(returned_venue);
        this.setRent_total(rent_total);
        this.setCustomer(customer);
    }

    public String getR_ID() {
        return r_ID;
    }

    public void setR_ID(String r_ID) {
        this.r_ID = r_ID;
    }

    public String getPickUpVenue() {
        return pickUpVenue;
    }

    public void setPickUpVenue(String pickUpVenue) {
        this.pickUpVenue = pickUpVenue;
    }

    public String getReturn_venue() {
        return return_venue;
    }

    public void setReturn_venue(String return_venue) {
        this.return_venue = return_venue;
    }

    public boolean isRequest_Status() {
        return request_Status;
    }

    public void setRequest_Status(boolean request_Status) {
        this.request_Status = request_Status;
    }

    public String getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(String pickupdate) {
        this.pickupdate = pickupdate;
    }

    public boolean isDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(boolean driverStatus) {
        this.driverStatus = driverStatus;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getRent_date() {
        return rent_date;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public String getReturneddate() {
        return returneddate;
    }

    public void setReturneddate(String returneddate) {
        this.returneddate = returneddate;
    }

    public String getReturned_venue() {
        return returned_venue;
    }

    public void setReturned_venue(String returned_venue) {
        this.returned_venue = returned_venue;
    }

    public double getRent_total() {
        return rent_total;
    }

    public void setRent_total(double rent_total) {
        this.rent_total = rent_total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Car> getListA() {
        return listA;
    }

    public void setListA(List<Car> listA) {
        this.listA = listA;
    }

    public List<Driver> getListDrivers() {
        return listDrivers;
    }

    public void setListDrivers(List<Driver> listDrivers) {
        this.listDrivers = listDrivers;
    }

    public List<Payment> getListOfPayment() {
        return listOfPayment;
    }

    public void setListOfPayment(List<Payment> listOfPayment) {
        this.listOfPayment = listOfPayment;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
