package lk.ijse.easycarrental.dto;

import lk.ijse.easycarrental.entity.Car;

public class CarSummeryDTO {

    private String Sche_num;
    private String TourStartDate;
    private String TourEndDate;

    private Car car;


    public CarSummeryDTO() {
    }

    public CarSummeryDTO(String sche_num, String tourStartDate, String tourEndDate, Car car) {
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
