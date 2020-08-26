package com.company826_static_proxy;

//被代理类
public class NikeClothFactory implements ClothFactory {
    @Override
    public void productCloth() {
        System.out.println("Nike工厂生产一批衣服");
    }
}
