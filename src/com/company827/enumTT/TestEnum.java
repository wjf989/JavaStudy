package com.company827.enumTT;

/**
 * * 一、枚举类
 * * 1.如何自定义枚举类
 * * 2.如何使用enum关键字定义枚举类
 * *     >常用的方法:values() valueOf(String name)
 * *     >如何让枚举类实现接口:可以让不同的枚举类的对象调用被重写的抽象方法，执行的效果不同。（相当于让每个对象重写抽象方法）
 */
public class TestEnum {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());
        System.out.println();

        //1.values()
        Season1[] season1s = Season1.values();
        for (Season1 season1 : season1s) {
            System.out.println(season1);
        }

        //2.valueof(String name):要求传入的形参name是枚举类对象的名字。
        //否则，报java.lang.IllegalArgumentException异常
        String str = "WINTER";
        Season1 sea = Season1.valueOf(str);
        System.out.println(sea);
        System.out.println();

        Thread.State[] states = Thread.State.values();
        for (Thread.State state : states) {
            System.out.println(state);
        }
        sea.show();
    }
}
