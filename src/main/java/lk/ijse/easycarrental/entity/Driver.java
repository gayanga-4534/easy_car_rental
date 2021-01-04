package lk.ijse.easycarrental.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {

    @Id
    private String DriverID;
    private String DriverName;
    private String Avalibility;
    private String password;
    private int ContatNum;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "driverDetails",
            joinColumns = {@JoinColumn(name = "DriverID", referencedColumnName = "DriverID")},
            inverseJoinColumns = {@JoinColumn(name = "rentID", referencedColumnName = "r_ID")}
    )
    private List<Rental> listRent=new ArrayList<Rental>();

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<DriverSummery> listofDriSummery=new ArrayList<DriverSummery>();

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<DriverLogin> listOfLogin=new ArrayList<DriverLogin>();

    public Driver() {
    }

    public Driver(String driverID, String driverName, String avalibility, String password, int contatNum) {
        setDriverID(driverID);
        setDriverName(driverName);
        setAvalibility(avalibility);
        this.setPassword(password);
        setContatNum(contatNum);
    }


    public String getDriverID() {
        return DriverID;
    }

    public void setDriverID(String driverID) {
        DriverID = driverID;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getAvalibility() {
        return Avalibility;
    }

    public void setAvalibility(String avalibility) {
        Avalibility = avalibility;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContatNum() {
        return ContatNum;
    }

    public void setContatNum(int contatNum) {
        ContatNum = contatNum;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<DriverLogin> getListOfLogin() {
        return listOfLogin;
    }

    public void setListOfLogin(List<DriverLogin> listOfLogin) {
        this.listOfLogin = listOfLogin;
    }

    public List<Rental> getListRent() {
        return listRent;
    }

    public void setListRent(List<Rental> listRent) {
        this.listRent = listRent;
    }

    public List<DriverSummery> getListofDriSummery() {
        return listofDriSummery;
    }

    public void setListofDriSummery(List<DriverSummery> listofDriSummery) {
        this.listofDriSummery = listofDriSummery;
    }
}
