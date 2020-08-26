package com.company826_dynamic_proxy;

// 被代理类
public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println("我是被代理类，记得要执行我哦！么么~~");
    }
}
