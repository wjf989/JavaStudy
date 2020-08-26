package com.company826_dynamic_proxy;

import com.company826_static_proxy.ClothFactory;
import com.company826_static_proxy.NikeClothFactory;

public class TestProxy {
    public static void main(String[] args) {
        //1.被代理类的对象
        RealSubject real = new RealSubject();
//        //2.创建一个实现了InvacationHandler接口的类的对象
//        MyInvocationHandler handler = new MyInvocationHandler();
//        //3.调用blind()方法，动态的返回一个同样实现了real所在类实现的接口Subject的代理类的对象。
//        Subject sub = (Subject)handler.blind(real);
//        sub.action();

//        NikeClothFactory nike = new NikeClothFactory();
//        ClothFactory proxyCloth = (ClothFactory) handler.blind(nike);
//        proxyCloth.productCloth();
        // 将上面的InvacationHandler的实现方法再次封装
        Subject sub = (Subject) MyProxyFactory.getProxy(real);
        sub.action();

        NikeClothFactory nike = new NikeClothFactory();
        ClothFactory proxy = (ClothFactory) MyProxyFactory.getProxy(nike);
        proxy.productCloth();


    }
}
