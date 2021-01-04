package lk.ijse.easycarrental.prefarences;

public class Preferances {

    private static Preferances preferances;

    public Preferances() {
    }

    private String userName="daham";
    private String password="123";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Preferances getInstance(){
        if(preferances==null){
            preferances=new Preferances();
        }
        return preferances;
    }

}
