package com.company831.abstracts;

public class Student extends Person {
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    void breath() {
        System.out.println("学生不应该呼吸雾霾的空气");
    }
}
