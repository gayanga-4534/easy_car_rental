package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class Car_summery {

    @Id
    private String Sche_num;
    private String TourStartDate;
    private String TourEndDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Car_Regnum", referencedColumnName = "reg_num")
    private Car car;

    public Car_summery() {
    }

    public Car_summery(String sche_num, String tourStartDate, String tourEndDate, Car car) {
        Sche_num = sche_num;
        TourStartDate = tourStartDate;
        TourEndDate = tourEndDate;
        this.car = car;
    }

    public String getSche_num() {
        return Sche_num;
    }

    public void setSche_num(String sche_num) {
        Sche_num = sche_num;
    }

    public String getTourStartDate() {
        return TourStartDate;
    }

    public void setTourStartDate(String tourStartDate) {
        TourStartDate = tourStartDate;
    }

    public String getTourEndDate() {
        return TourEndDate;
    }

    public void setTourEndDate(String tourEndDate) {
        TourEndDate = tourEndDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
