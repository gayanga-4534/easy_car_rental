package lk.ijse.easycarrental.entity;

import javax.persistence.*;

@Entity
public class Admin_login {

    @Id
    private String adminlog_ID;
    private String logindatetime;

    public Admin_login() {
    }

    public Admin_login(String adminlog_ID, String logindatetime) {
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
