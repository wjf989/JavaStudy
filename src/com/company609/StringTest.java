package com.company609;

public class StringTest {
  public static void main(String[] args) {
//        int no = 10;
//        String str = "abcdef";
//        String str1 = str + "xyz" + no;
//
//        str1 = str1 + "123";
//        char c = '过';
//
//        double pi = 3.1416;
//        str1 = str1 + pi;
//
//        boolean b = false;
//        str1 = str1 + b;
//        str1 = str1 + c;
//
//        System.out.println("str1 = " + str1);
// ==================================================
//        String str1 = 4;
// java 是属于强类型转换，不能直接赋值整数给String，除非改值有跟其他字符串进行运算
//        String str2 =3.5f+"";
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(3+4+"hello!");
//        System.out.println("hello!"+3+4);
//        System.out.println('a'+1+"hello!");
//        System.out.println("hello"+'a'+1);
// ==================================================
    //类型强制转换
//        String a="43";
//        String b=a+2;
//        int i=Integer.parseInt(a)+2;
//        System.out.println("a="+a+"; i="+i +"; b="+b);
// ==================================================
    //练习
//        short s=5;
//        System.out.println(s);
//        s=s-2; //Error:(40, 12) java: 不兼容的类型: 从int转换到short可能会有损失
//        System.out.println(s);
//
//        byte b=3;
//        System.out.println(b);
//        b=b+4;Error:(45, 12) java: 不兼容的类型: 从int转换到byte可能会有损失
//        b=(byte)(b+4); //通过强制转换，通过类型校验
//        System.out.println(b);
//
//        char c='a';
//        int i=5;
//        float d=3.14f;
//        double result=c+i+d; //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
//        System.out.println(result);
//
//        byte b=5;
//        short s=3;
//        short t=s+b;
//        System.out.println(t);
// ==================================================
    //算术运算符
    System.out.println("5+5=" + 5 + 5); //结果55
    System.out.println("5+5=" + (5 + 5)); //结果10

    //对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时，只保留整数部分而舍弃小数部分
    //若通过强转，则可以获取小数部分的运算结果
    int x = 3510;
    x = (int) (x / 1000.0 * 1000);
    int y = x / 1000 * 1000;
    System.out.println("x=" + x);
    System.out.println("y=" + y);

  }
}

