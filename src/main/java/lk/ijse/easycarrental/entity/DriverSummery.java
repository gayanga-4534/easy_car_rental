package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class DriverSummery {

    @Id
    private String dsID;
    private String tourStartDate;
    private String tourEndDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DriverId", referencedColumnName = "DriverID", nullable = false)
    private Driver driver;

    public DriverSummery() {
    }

    public DriverSummery(String dsID, String tourStartDate, String tourEndDate, Driver driver) {
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
