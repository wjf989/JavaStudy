package com.company609;

public class TestLogic {
  public static void main(String[] args) {
    //题目1
//        int x = 1;
//        int y=1;
//
//        if(x++==2 & ++y==2){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y); //x=2,y=2

    //题目2
//        int x = 1,y = 1;
//        //&&是一个短路运算符
//        if(x++==2 && ++y==2){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y); //x=2, y=1

    //题目3
//        int x = 1,y = 1;
//
//        if(x++==1 | ++y==1){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y); //x=7, y=2

    //题目4
    int x = 1, y = 1;

    if (x++ == 1 || ++y == 1) {
      x = 7;
    }
    System.out.println("x=" + x + ",y=" + y); //x=7,y=1
  }
}
