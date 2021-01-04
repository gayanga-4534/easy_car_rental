package lk.ijse.easycarrental.dto;

public class CustomDTO {
    private String type;
    private String transmission_type;
    private int numberofpass;
    private double dailyrate;
    private String brand;
    private String fuelType;

    String pickupdate;
    String dropoffdate;

    public CustomDTO(String pickupdate, String dropoffdate) {
        this.pickupdate = pickupdate;
        this.dropoffdate = dropoffdate;
    }

    public CustomDTO() {
    }

    public CustomDTO(String type, String transmission_type, int numberofpass, double dailyrate, String brand, String fuelType) {
        this.type = type;
        this.transmission_type = transmission_type;
        this.numberofpass = numberofpass;
        this.dailyrate = dailyrate;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public int getNumberofpass() {
        return numberofpass;
    }

    public void setNumberofpass(int numberofpass) {
        this.numberofpass = numberofpass;
    }

    public double getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(double dailyrate) {
        this.dailyrate = dailyrate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
