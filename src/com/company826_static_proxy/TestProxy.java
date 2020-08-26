package com.company826_static_proxy;

public class TestProxy {
    public static void main(String[] args) {
        NikeClothFactory nike = new NikeClothFactory(); // 创建被代理类的对象
        ProxyFactory proxy = new ProxyFactory(nike); // 创建代理类的对象
        proxy.productCloth();
    }
}
