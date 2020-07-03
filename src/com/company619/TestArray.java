package com.company619;

public class TestArray {
  public static void main(String[] args) {
//    int[] s;
//    s = new int[10];
//    for (int i = 0; i < s.length; i++) {
//      s[i] = 2 * i + 1;
//      System.out.println(s[i] + "--" + s.length);
//
//    }
    MyDate[] m;
    m = new MyDate[10];
    for (int i = 0; i < m.length; i++) {
      m[i] = new MyDate(i + 1, i + 1, 1990 + i);
      m[i].display();
    }

  }
}
