package com.javafiles.model;

public class UserDetail {
    public UserDetail userDetail; // This field seems like it might be intended to reference another UserDetail
                                  // object, but it's not used in a typical manner.
    private String userName; // Username of the user
    private String password; // Password of the user
    private String role; // Role or type of user (e.g., admin, regular user)
    private String elecid;
    private String dob;
    private String mailId;


   

    public String getElecid() {
        return elecid;
    }

    public void setElecid(String elecid) {
        this.elecid = elecid;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

   

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    // Getters and setters for each field
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Override toString() to provide a string representation of the object
    @Override
    public String toString() {
        return "UserDetail [userDetail=" + userDetail + ",userName=" + userName + ", password=" + password + ", role=" + role + ", emailid=+" +mailId+",dob="+dob+"Election-ID"+elecid+"]";

    }
}
