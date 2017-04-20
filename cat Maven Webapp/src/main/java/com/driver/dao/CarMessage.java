package com.driver.dao;

public class CarMessage {
    private String offenceno;

    private String offencetype;

    private String offencename;

    private String offencecity;

    private String offencesite;

    private String offencetime;

    private String offencestate;

    private Integer offenceoverdue;

    private String penaltypoint;

    private String penaltyfee;

    private String vehicleno;

    private String provider;

    public String getOffenceno() {
        return offenceno;
    }

    public void setOffenceno(String offenceno) {
        this.offenceno = offenceno == null ? null : offenceno.trim();
    }

    public String getOffencetype() {
        return offencetype;
    }

    public void setOffencetype(String offencetype) {
        this.offencetype = offencetype == null ? null : offencetype.trim();
    }

    public String getOffencename() {
        return offencename;
    }

    public void setOffencename(String offencename) {
        this.offencename = offencename == null ? null : offencename.trim();
    }

    public String getOffencecity() {
        return offencecity;
    }

    public void setOffencecity(String offencecity) {
        this.offencecity = offencecity == null ? null : offencecity.trim();
    }

    public String getOffencesite() {
        return offencesite;
    }

    public void setOffencesite(String offencesite) {
        this.offencesite = offencesite == null ? null : offencesite.trim();
    }

    public String getOffencetime() {
        return offencetime;
    }

    public void setOffencetime(String offencetime) {
        this.offencetime = offencetime == null ? null : offencetime.trim();
    }

    public String getOffencestate() {
        return offencestate;
    }

    public void setOffencestate(String offencestate) {
        this.offencestate = offencestate == null ? null : offencestate.trim();
    }

    public Integer getOffenceoverdue() {
        return offenceoverdue;
    }

    public void setOffenceoverdue(Integer offenceoverdue) {
        this.offenceoverdue = offenceoverdue;
    }

    public String getPenaltypoint() {
        return penaltypoint;
    }

    public void setPenaltypoint(String penaltypoint) {
        this.penaltypoint = penaltypoint == null ? null : penaltypoint.trim();
    }

    public String getPenaltyfee() {
        return penaltyfee;
    }

    public void setPenaltyfee(String penaltyfee) {
        this.penaltyfee = penaltyfee == null ? null : penaltyfee.trim();
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno == null ? null : vehicleno.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }
}