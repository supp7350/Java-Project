package com.javafiles.model;

public class Playerr {
    private String AAP;
    private String BJP;
    private String NCP;
    private String NPP;
    private String BSP;
    private String CPI;
    public String getAAP() {
        return AAP;
    }
    public void setAAP(String aAP) {
        AAP = aAP;
    }
    public String getBJP() {
        return BJP;
    }
    public void setBJP(String bJP) {
        BJP = bJP;
    }
    public String getNCP() {
        return NCP;
    }
    public void setNCP(String nCP) {
        NCP = nCP;
    }
    public String getNPP() {
        return NPP;
    }
    public void setNPP(String nPP) {
        NPP = nPP;
    }
    public String getBSP() {
        return BSP;
    }
    public void setBSP(String bSP) {
        BSP = bSP;
    }
    public String getCPI() {
        return CPI;
    }
    public void setCPI(String cPI) {
        CPI = cPI;
    }
    @Override
    public String toString() {
    return "Player [AAP=" + AAP + ",BSP=" + BSP + ", NPP=" + NPP + ", BJP =" + BJP + ",CPI=" + CPI + ", NCP=" +NCP;
    }
}
