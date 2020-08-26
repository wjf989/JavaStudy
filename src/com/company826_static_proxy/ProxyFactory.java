package com.company826_static_proxy;

// 代理类
public class ProxyFactory implements ClothFactory {
    ClothFactory cf;

    //创建代理类的对象时，实际传入一个被代理类的对象
    public ProxyFactory(ClothFactory cf) {
        this.cf = cf;
    }

    @Override
    public void productCloth() {
        System.out.println("代理类开始执行，收代理费$1000");
        cf.productCloth();
    }
}
