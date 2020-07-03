package com.company610;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class TestSwitch {
  public static void main(String[] args) {
//        int i = 2;
//        switch (i) {
//            case 0:
//                System.out.println("zero");
//                break;
//            case 1:
//                System.out.println("one");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }
    Scanner input = new Scanner(System.in);
    System.out.println("请输入数字：");
    String s = input.nextLine();
    double score = 0;

    for (; ; ) {
      if (StringUtils.isNumeric(s)) {
        score = Double.parseDouble(s);
        break;
      } else {
        System.out.println("输入的数字非法，请重新输入！！！");
        s = input.nextLine();
      }

    }


    System.out.println("score=" + score);

    switch ((int) score / 10) {
      case 10:
      case 9:
        System.out.println("等级：A");
        break;
      case 8:
      case 7:
        System.out.println("等级：B");
        break;
      case 6:
        System.out.println("等级：C");
        break;
      default:
        System.out.println("等级：D");
        break;

    }
    input.close();
  }
}
