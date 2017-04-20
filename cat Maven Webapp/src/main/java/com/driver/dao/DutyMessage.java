package com.driver.dao;

public class DutyMessage {
    private String dutyno;

    private String dutytype;

    private String dutyname;

    private String dutytel;

    private String dutycity;

    private String dutyreason;

    public String getDutyno() {
        return dutyno;
    }

    public void setDutyno(String dutyno) {
        this.dutyno = dutyno == null ? null : dutyno.trim();
    }

    public String getDutytype() {
        return dutytype;
    }

    public void setDutytype(String dutytype) {
        this.dutytype = dutytype == null ? null : dutytype.trim();
    }

    public String getDutyname() {
        return dutyname;
    }

    public void setDutyname(String dutyname) {
        this.dutyname = dutyname == null ? null : dutyname.trim();
    }

    public String getDutytel() {
        return dutytel;
    }

    public void setDutytel(String dutytel) {
        this.dutytel = dutytel == null ? null : dutytel.trim();
    }

    public String getDutycity() {
        return dutycity;
    }

    public void setDutycity(String dutycity) {
        this.dutycity = dutycity == null ? null : dutycity.trim();
    }

    public String getDutyreason() {
        return dutyreason;
    }

    public void setDutyreason(String dutyreason) {
        this.dutyreason = dutyreason == null ? null : dutyreason.trim();
    }
}