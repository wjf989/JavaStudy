package com.company609;

public class TestIf {
  public static void main(String[] args) {
    boolean b = true;
    //如果写成b=false【是一个赋值操作】，则最终输出结果为c；原先的b==false【是一个比较操作】，输出结果为b
    if (b == false)
      System.out.println('a');
    else if (b)
      System.out.println('b');
    else if (!b)
      System.out.println('c');
    else
      System.out.println('d');
  }
}
