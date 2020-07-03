package com.company609;

public class TestSign {
  public static void main(String[] args) {
    int i1 = 10;
    int i2 = 20;
    int i = i1++;
    System.out.print("i=" + i);
    System.out.println("i1=" + i1);
    i = ++i1;
    System.out.print("i=" + i);
    System.out.println("i1=" + i1);
    i = i2--;
    System.out.print("i=" + i);
    System.out.println("i2=" + i2);
    i = --i2;
    System.out.print("i=" + i);
    System.out.println("i2=" + i2);

  }
}
