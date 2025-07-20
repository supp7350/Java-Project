package com.javafiles.model;

public class authDetail {
    private String annemail; // Username of the user
    private String anselid; // Password of the user
    private String anssafid; // Role or type of user (e.g., admin, regular user)
    public String getAnnemail() {
        return annemail;
    }
    public void setAnnemail(String annemail) {
        this.annemail = annemail;
    }
    public String getAnselid() {
        return anselid;
    }
    public void setAnselid(String anselid) {
        this.anselid = anselid;
    }
    public String getAnssafid() {
        return anssafid;
    }
    public void setAnssafid(String anssafid) {
        this.anssafid = anssafid;
    }
    

}
