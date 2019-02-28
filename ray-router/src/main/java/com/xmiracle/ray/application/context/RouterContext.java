package com.xmiracle.ray.application.context;

import com.xmiracle.ray.application.common.GatewayType;
import org.jetbrains.annotations.NotNull;


public interface RouterContext {

    @NotNull
    //RouterContextRuntime getRouterContextRuntime();

    void invoke();

    void destroy();

    RayRequest getRequestData();

    void setRequestData(RayRequest requestData);

    RayResponse getResponseData();

    void setResponseData(RayResponse responseData);

    GatewayType getGatewayType();

    String getApi();

    String getVersion();

    void enableStressTest();

    void finish();
}
