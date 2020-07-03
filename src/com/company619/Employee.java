package com.company619;

public class Employee {
  String name = "张三";
  String address;
  float salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public void receivesPay() {
    System.out.println("receivesPay");
  }
}
