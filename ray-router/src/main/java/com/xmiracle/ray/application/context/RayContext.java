package com.xmiracle.ray.application.context;

import java.io.Serializable;

public class RayContext implements Serializable{

    private long serialID;
    private Object bizData;
    private boolean success;
    private boolean errMsg;

    public long getSerialID() {
        return serialID;
    }

    public void setSerialID(long serialID) {
        this.serialID = serialID;
    }

    public Object getBizData() {
        return bizData;
    }

    public void setBizData(Object bizData) {
        this.bizData = bizData;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isErrMsg() {
        return errMsg;
    }

    public void setErrMsg(boolean errMsg) {
        this.errMsg = errMsg;
    }
}
