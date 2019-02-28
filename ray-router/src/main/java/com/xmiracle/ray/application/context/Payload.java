package com.xmiracle.ray.application.context;

import java.io.Serializable;

public class Payload implements Serializable {

    private static final long serialVersionUID = 1358436028133946809L;

    private String api;

    private String v;

    private String ret;

    private String msg;

    private Object data;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
