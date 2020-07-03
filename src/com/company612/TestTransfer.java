package com.company612;

public class TestTransfer {
  public static void swap(int a, int b) {
    int tmp = a;
    a = b;
    b = tmp;
    System.out.println("swap start a=" + a + "; b=" + b);
  }

  public static void main(String[] args) {
    int a = 6;
    int b = 9;
    swap(a, b);
    System.out.println("swap end a=" + a + "; b=" + b);
  }
}
