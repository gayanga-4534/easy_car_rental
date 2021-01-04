package lk.ijse.easycarrental.dto;

public class CustomerDTO {

    private String Customer_id;
    private String Cus_name;
    private String Cus_NIC;
    private String Password;
    private String DateandTime;
    private boolean accept_status;
    private int Contact_num;

    public CustomerDTO() {
    }

    public CustomerDTO(String customer_id) {
        Customer_id = customer_id;
    }

    public CustomerDTO(String customer_id, String cus_name, String cus_NIC, String password, String dateandTime, boolean accept_status, int contact_num) {
        Customer_id = customer_id;
        Cus_name = cus_name;
        Cus_NIC = cus_NIC;
        Password = password;
        DateandTime = dateandTime;
        this.accept_status = accept_status;
        Contact_num = contact_num;
    }



    public String getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(String customer_id) {
        Customer_id = customer_id;
    }

    public String getCus_name() {
        return Cus_name;
    }

    public void setCus_name(String cus_name) {
        Cus_name = cus_name;
    }

    public String getCus_NIC() {
        return Cus_NIC;
    }

    public void setCus_NIC(String cus_NIC) {
        Cus_NIC = cus_NIC;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDateandTime() {
        return DateandTime;
    }

    public void setDateandTime(String dateandTime) {
        DateandTime = dateandTime;
    }

    public boolean isAccept_status() {
        return accept_status;
    }

    public void setAccept_status(boolean accept_status) {
        this.accept_status = accept_status;
    }

    public int getContact_num() {
        return Contact_num;
    }

    public void setContact_num(int contact_num) {
        Contact_num = contact_num;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "Customer_id='" + Customer_id + '\'' +
                ", Cus_name='" + Cus_name + '\'' +
                ", Cus_NIC='" + Cus_NIC + '\'' +
                ", Password='" + Password + '\'' +
                ", DateandTime='" + DateandTime + '\'' +
                ", accept_status='" + accept_status + '\'' +
                ", Contact_num=" + Contact_num +
                '}';
    }

}
