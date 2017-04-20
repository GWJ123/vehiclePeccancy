package com.driver.dao;

import java.util.Date;

public class Handle {
    private Integer handleId;

    private Date handleTime;

    private String handleManType;

    private String handleManName;

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandleManType() {
        return handleManType;
    }

    public void setHandleManType(String handleManType) {
        this.handleManType = handleManType == null ? null : handleManType.trim();
    }

    public String getHandleManName() {
        return handleManName;
    }

    public void setHandleManName(String handleManName) {
        this.handleManName = handleManName == null ? null : handleManName.trim();
    }
}