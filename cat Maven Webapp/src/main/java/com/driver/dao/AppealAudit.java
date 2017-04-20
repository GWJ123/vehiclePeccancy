package com.driver.dao;

import java.util.Date;

public class AppealAudit {
    private Integer appealId;

    private Integer appealIllegalId;

    private String appealState;

    private String appealReason;

    private Date appealTime;

    private String auditManType;

    private Integer auditManId;

    private String auditManName;

    private Integer auditManTel;

    private String auditState;

    private Date auditTime;

    private Date auditCommitTime;

    public Integer getAppealId() {
        return appealId;
    }

    public void setAppealId(Integer appealId) {
        this.appealId = appealId;
    }

    public Integer getAppealIllegalId() {
        return appealIllegalId;
    }

    public void setAppealIllegalId(Integer appealIllegalId) {
        this.appealIllegalId = appealIllegalId;
    }

    public String getAppealState() {
        return appealState;
    }

    public void setAppealState(String appealState) {
        this.appealState = appealState == null ? null : appealState.trim();
    }

    public String getAppealReason() {
        return appealReason;
    }

    public void setAppealReason(String appealReason) {
        this.appealReason = appealReason == null ? null : appealReason.trim();
    }

    public Date getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(Date appealTime) {
        this.appealTime = appealTime;
    }

    public String getAuditManType() {
        return auditManType;
    }

    public void setAuditManType(String auditManType) {
        this.auditManType = auditManType == null ? null : auditManType.trim();
    }

    public Integer getAuditManId() {
        return auditManId;
    }

    public void setAuditManId(Integer auditManId) {
        this.auditManId = auditManId;
    }

    public String getAuditManName() {
        return auditManName;
    }

    public void setAuditManName(String auditManName) {
        this.auditManName = auditManName == null ? null : auditManName.trim();
    }

    public Integer getAuditManTel() {
        return auditManTel;
    }

    public void setAuditManTel(Integer auditManTel) {
        this.auditManTel = auditManTel;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getAuditCommitTime() {
        return auditCommitTime;
    }

    public void setAuditCommitTime(Date auditCommitTime) {
        this.auditCommitTime = auditCommitTime;
    }
}