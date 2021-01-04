package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class DriverLogin {

    @Id
    private
    String driverLohinID;
    private String logindateandtime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driverID" , referencedColumnName = "DriverID")
    private Driver driver;

    public DriverLogin() {
    }

    public DriverLogin(String driverLohinID, String logindateandtime, Driver driver) {
        this.setDriverLohinID(driverLohinID);
        this.setLogindateandtime(logindateandtime);
        this.setDriver(driver);
    }


    public String getDriverLohinID() {
        return driverLohinID;
    }

    public void setDriverLohinID(String driverLohinID) {
        this.driverLohinID = driverLohinID;
    }

    public String getLogindateandtime() {
        return logindateandtime;
    }

    public void setLogindateandtime(String logindateandtime) {
        this.logindateandtime = logindateandtime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
