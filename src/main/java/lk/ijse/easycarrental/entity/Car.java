package lk.ijse.easycarrental.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {

    @Id
    private String reg_num;
    private String carname;
    private String color;
    private String brand;
    private boolean avalibility;
    private String type;
    private String transmission_type;
    private double priceForextraKM;
    private String fuelType;
    private double km;
    private double montlyrate;
    private double dailyrate;
    private int numberofpass;
    private String damageStatus;
    private int freemileage;
    private boolean maintainenceStatus;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "Rental_details",
            joinColumns = {@JoinColumn(name = "regNum", referencedColumnName = "reg_num")},
            inverseJoinColumns = {@JoinColumn(name = "rentID", referencedColumnName = "r_ID")}
    )
    private List<Rental> rentalList=new ArrayList<Rental>();

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Car_summery> listofCarSummery=new ArrayList<Car_summery>();

    public Car() {
    }

    public Car(String reg_num, boolean maintainenceStatus) {
        this.reg_num = reg_num;
        this.maintainenceStatus = maintainenceStatus;
    }

    public int getNumberofpass() {
        return numberofpass;
    }

    public void setNumberofpass(int numberofpass) {
        this.numberofpass = numberofpass;
    }

    public String getDamageStatus() {
        return damageStatus;
    }

    public void setDamageStatus(String damageStatus) {
        this.damageStatus = damageStatus;
    }

    public int getFreemileage() {
        return freemileage;
    }

    public void setFreemileage(int freemileage) {
        this.freemileage = freemileage;
    }

    public boolean isMaintainenceStatus() {
        return maintainenceStatus;
    }

    public void setMaintainenceStatus(boolean maintainenceStatus) {
        this.maintainenceStatus = maintainenceStatus;
    }

    public Car(String reg_num, String carname, String color, String brand, boolean avalibility, String type, String transmission_type, double priceForextraKM, String fuelType, double km, double montlyrate, double dailyrate, int numberofpass, String damageStatus, int freemileage, boolean maintainenceStatus) {
        this.reg_num = reg_num;
        this.carname = carname;
        this.color = color;
        this.brand = brand;
        this.avalibility = avalibility;
        this.type = type;
        this.transmission_type = transmission_type;
        this.priceForextraKM = priceForextraKM;
        this.fuelType = fuelType;
        this.km = km;
        this.montlyrate = montlyrate;
        this.dailyrate = dailyrate;
        this.numberofpass = numberofpass;
        this.damageStatus = damageStatus;
        this.freemileage = freemileage;
        this.maintainenceStatus = maintainenceStatus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAvalibility() {
        return avalibility;
    }

    public void setAvalibility(boolean avalibility) {
        this.avalibility = avalibility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public double getPriceForextraKM() {
        return priceForextraKM;
    }

    public void setPriceForextraKM(double priceForextraKM) {
        this.priceForextraKM = priceForextraKM;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMontlyrate() {
        return montlyrate;
    }

    public void setMontlyrate(double montlyrate) {
        this.montlyrate = montlyrate;
    }

    public double getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(double dailyrate) {
        this.dailyrate = dailyrate;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Car_summery> getListofCarSummery() {
        return listofCarSummery;
    }

    public void setListofCarSummery(List<Car_summery> listofCarSummery) {
        this.listofCarSummery = listofCarSummery;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

}
