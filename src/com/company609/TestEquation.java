package com.company609;

public class TestEquation {
  double a, b, c; //方程的系数
  double x1, x2; //两个根
  double r;//实部
  double v; //虚部
  int type;//0表示一个根，1表示两个实根，2表示两个复数的根

  public TestEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }


  private double delta() {
    return b * b - 4 * a * c;
  }


  public void calculate() {
    double d = delta();
    if (Math.abs(d) < 1E-5) {
      type = 0;
      x1 = -b / (2 * a);
      x2 = x1;
    } else if (d > 0) {
      type = 1;
      x1 = (-b + Math.sqrt(d)) / (2 * a);
      x2 = (-b - Math.sqrt(d)) / (2 * a);
    } else {
      type = 2;
      r = -b / (2 * a);
      v = Math.sqrt(-d) / (2 * a);
    }
  }


  public void showResult() {
    switch (type) {
      case 0:
        System.out.println("方程只有一个实根，x1=x2=" + x1);
        break;
      case 1:
        System.out.println("方程有两个实根，分别是：x1=" + x1 + "/tx2=" + x2);
        break;
      case 2:
        System.out.println("方程有两个复数根，分别是：" + r + "+" + v + "i,/t" + r + "-" + v + "i");
        break;
    }
  }


  public static void main(String[] args) {
    TestEquation eq1 = new TestEquation(1, 2, 2);
    eq1.calculate();
    eq1.showResult();
    TestEquation eq2 = new TestEquation(1, -2, 1);
    eq2.calculate();
    eq2.showResult();
    TestEquation eq3 = new TestEquation(1, 6, 5);
    eq3.calculate();
    eq3.showResult();
  }

}


