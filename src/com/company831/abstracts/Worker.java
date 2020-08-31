package com.company831.abstracts;

public abstract class Worker extends Person {
    @Override
    public void eat() {
        System.out.println("工人吃饭");
    }

    @Override
    public void walk() {
        System.out.println("工人走路");
    }
}
