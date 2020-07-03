package com.company619;

public class MyDate {
  private int day;
  private int month;
  private int year;

  //构造器
  public MyDate(int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public void display() {
    System.out.println(year + "-" + month + "-" + day);
  }
}
