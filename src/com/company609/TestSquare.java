package com.company609;

public class TestSquare {
  public static void main(String[] args) {
    //求ax2+bx+c=0方程的根。
    //若b2-4ac>0,有2个解
    //b2-4ac=0, 有一个解
    //b2-4ac<0, 无解
    double x1, x2; //根
    double b, a, c; //系数
    double gongshi;

    b = 20;
    a = 2;
    c = 5;
    gongshi = Math.pow(b, 2) - 4 * a * c;
    if (gongshi > 0) {
      x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
      x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

    } else if (gongshi == 0) {
      x1 = -b / (2 * a);
      x2 = x1;
    } else {
      System.out.println("无根");
    }
  }
}
