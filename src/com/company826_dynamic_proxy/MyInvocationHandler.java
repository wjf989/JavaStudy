package com.company826_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    Object obj;// 实现了接口的被代理类的对象的声明

    // ①给被代理的对象实例化
    // ②返回一个代理类的对象
    public Object blind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    //当通过代理类的对象发起对被重写的方法的调用时，都会转换为对如下的invoke方法的调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }

}
