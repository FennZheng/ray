package com.xmiracle.ray.application.context;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RayRequest implements Serializable {

    private static final long serialVersionUID = 3004655054945234689L;

    private String api;
    private String v;
    private final Map<String, String> header = new HashMap<>();
    private final Map<String, Object> parameter = new HashMap<>();
    private Object reqData;
    private String clientIp;
    private int timeout;
    private String serviceGroup;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public Object getReqData() {
        return reqData;
    }

    public void setReqData(Object reqData) {
        this.reqData = reqData;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public Map<String, Object> getParameter() {
        return parameter;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }
}
