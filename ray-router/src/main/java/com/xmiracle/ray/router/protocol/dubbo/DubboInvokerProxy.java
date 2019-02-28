package com.xmiracle.ray.router.protocol.dubbo;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.service.GenericService;

public class DubboInvokerProxy {

    private static ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();

    public GenericService getService(String interfaceName, String ver){
        reference.setInterface(interfaceName);
        reference.setVersion(ver);
        reference.setGeneric(true);
        return reference.get();
    }

    public Object invoke(String interfaceName, String ver, String methodName, String[] parameterTypes, Object[] params){
        GenericService genericService = getService(interfaceName, ver);
        Object result = genericService.$invoke(methodName, parameterTypes, params);
        return result;
    }


}
