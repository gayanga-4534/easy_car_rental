package lk.ijse.easycarrental.dto;

public class DriverDTO {

    private String DriverID;
    private String DriverName;
    private String Avalibility;
    private String password;
    private int ContatNum;

    public DriverDTO() {
    }

    public DriverDTO(String driverID, String driverName, String avalibility, String password, int contatNum) {
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

}
