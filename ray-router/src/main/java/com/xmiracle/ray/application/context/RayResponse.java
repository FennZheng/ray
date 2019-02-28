package com.xmiracle.ray.application.context;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RayResponse implements Serializable {

    private static final long serialVersionUID = -6826601439672222651L;

    private final Map<String, String> header = new HashMap<>();
    private int httpStatus = 200;
    private Payload responseData;
    private Map<String, Object> extra;

    public Payload getResponseData() {
        return responseData;
    }

    public void setResponseData(Payload responseData) {
        this.responseData = responseData;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
