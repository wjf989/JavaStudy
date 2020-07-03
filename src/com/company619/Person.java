package com.company619;

public class Person {
  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String say() {
    return "姓名: " + name + " 年龄: " + age;
  }
}
