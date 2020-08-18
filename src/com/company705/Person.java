package com.company705;

public class Person<T> {
    //使用T类型定义变量
    private T info;

    //使用T类型定义一般方法
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    //使用T类型定义构造器
    public Person() {
    }

    public Person(T info) {
        this.info = info;
    }

    //static的方法中不能声明泛型
    //不能再try-catch中使用泛型定义
}
