package lk.ijse.easycarrental.dto;

public class Admin_DTO {

    private String adminlog_ID;
    private String logindatetime;

    public Admin_DTO() {
    }

    public Admin_DTO(String adminlog_ID, String logindatetime) {
        this.adminlog_ID = adminlog_ID;
        this.logindatetime = logindatetime;
    }

    public String getAdminlog_ID() {
        return adminlog_ID;
    }

    public void setAdminlog_ID(String adminlog_ID) {
        this.adminlog_ID = adminlog_ID;
    }

    public String getLogindatetime() {
        return logindatetime;
    }

    public void setLogindatetime(String logindatetime) {
        this.logindatetime = logindatetime;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
