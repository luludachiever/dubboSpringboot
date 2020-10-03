package com.dubboFilterHw.provider;

import org.apache.dubbo.rpc.*;


public class RpcFilter implements org.apache.dubbo.rpc.Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String clientIp = RpcContext.getContext().getRemoteHost();
        System.out.println("client Ip:"+clientIp);
        try {
            // 执行方法
            return  invoker.invoke(invocation);
        } finally {
            System.out.println("invoke done");
        }

    }
}
