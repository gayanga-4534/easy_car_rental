package lk.ijse.easycarrental.dto;

import lk.ijse.easycarrental.entity.Driver;

public class DriverSummeryDTO {
    private String dsID;
    private String tourStartDate;
    private String tourEndDate;

    private Driver driver;

    public DriverSummeryDTO() {
    }

    public DriverSummeryDTO(String dsID, String tourStartDate, String tourEndDate, Driver driver) {
        this.dsID = dsID;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
        this.driver = driver;
    }

    public String getDsID() {
        return dsID;
    }

    public void setDsID(String dsID) {
        this.dsID = dsID;
    }

    public String getTourStartDate() {
        return tourStartDate;
    }

    public void setTourStartDate(String tourStartDate) {
        this.tourStartDate = tourStartDate;
    }

    public String getTourEndDate() {
        return tourEndDate;
    }

    public void setTourEndDate(String tourEndDate) {
        this.tourEndDate = tourEndDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
