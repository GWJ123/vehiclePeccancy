package com.driver.dao;

public class ProcessInformation {
    private Integer id;

    private String processorType;

    private String processorId;

    private String processorName;

    private String processorPhone;

    private String serveCity;

    private String peccancyCity;

    private String checkStatus;

    private String checkTime;

    private String checkMessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType == null ? null : processorType.trim();
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId == null ? null : processorId.trim();
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName == null ? null : processorName.trim();
    }

    public String getProcessorPhone() {
        return processorPhone;
    }

    public void setProcessorPhone(String processorPhone) {
        this.processorPhone = processorPhone == null ? null : processorPhone.trim();
    }

    public String getServeCity() {
        return serveCity;
    }

    public void setServeCity(String serveCity) {
        this.serveCity = serveCity == null ? null : serveCity.trim();
    }

    public String getPeccancyCity() {
        return peccancyCity;
    }

    public void setPeccancyCity(String peccancyCity) {
        this.peccancyCity = peccancyCity == null ? null : peccancyCity.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getCheckMessage() {
        return checkMessage;
    }

    public void setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage == null ? null : checkMessage.trim();
    }
}