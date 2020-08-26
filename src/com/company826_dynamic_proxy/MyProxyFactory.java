package com.company826_dynamic_proxy;

public class MyProxyFactory {
    // 指定target生成动态代理对象
    public static Object getProxy(Object target) {
        MyInvocationHandler handler = new MyInvocationHandler();
        return handler.blind(target);

    }
}
