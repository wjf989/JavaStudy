package com.company827.generic;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
    private String orderName;
    private int orderId;
    private T t;
    ArrayList<T> list = new ArrayList<>();
//    List list = new ArrayList<>();

    public void add() {
        list.add(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //不可以在static方法中使用泛型的声明
//    public static void show(){
//        System.out.println(t);
//    }
    public void info() {
        //不可以在try-catch中使用类的泛型的声明
//        try{
//
//        }catch(T e){
//
//        }
    }

    //声明泛型方法
    public static <E> E getE(E e) {
        return e;
    }

    //实现数组到集合的复制
    public <E> List fromArrayToList(E[] e, List list) {
        for (E e1 : e) {
            list.add(e1);
        }
        return list;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order [orderName=" + orderName + ", orderId=" + orderId
          + ", t=" + t + "]";
    }
}
