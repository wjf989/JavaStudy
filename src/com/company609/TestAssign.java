package com.company609;

public class TestAssign {
  public static void main(String[] args) {
    int i = 1;
    i *= 0.1;
    System.out.println(i);//
    i++;
    System.out.println(i);//

    short s = 3;
//        s=s+2;
    s += 2; //当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理
    System.out.println(s);


  }
}
