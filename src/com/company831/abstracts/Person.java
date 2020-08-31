package com.company831.abstracts;

public abstract class Person extends Creator {
    String name;

    public abstract void eat();

    public abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }
}
