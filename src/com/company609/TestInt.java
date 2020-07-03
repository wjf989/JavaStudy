package com.company609;

public class TestInt {
  public static void main(String[] args) {
    //随意给出一个三位数整数，打印显示它的个位数，十位数，百位数的值
    int sm = 351;
    int bw = sm / 100;
    int sw = (sm % 100) / 10;
    int gw = sm % 10;

    System.out.println("sm=" + sm);
    System.out.printf("sm的位数分布列表如下：百位：%s，十位：%s，个位：%s%n", bw, sw, gw);
    System.out.println("========");
  }
}
