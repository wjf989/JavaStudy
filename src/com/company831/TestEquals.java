package com.company831;

import com.company827.polymorphic.Person;
import org.junit.Test;

public class TestEquals {
    public static void main(String[] args) {
        //equals():
        //①只能处理引用类型变量②在Object类，发现equals()仍然比较的两个引用变量的地址值是否相等
        //java.lang.Object类，是所有类的根父类
        Person p1 = new Person();
        Person p2 = new Person();
        //false
        System.out.println(p1.equals(p2));
        //false
        System.out.println(p1 == p2);

        //像String 包装类 File类 Date类这些重写Object类的equals()方法，比较是两个对象的"实体内容"是否完全相同。
        String str1 = "AA";
        String str2 = "AA";
        //true
        System.out.println(str1.equals(str2));
        //false
        System.out.println(str1 == str2 ? 0 : 1);
    }

    @Test
    public void test1() {
        // ==
        // 1.基本数据类型：根据基本数据类型的值判断是否相等。相等返回true，反之返回false
        // 注：两端数据类型可以不同，在不同的情况下，也可以返回true。
        // 2.引用数据类型：比较引用类型变量的地址值是否相等
        int i = 12;
        int j = 12;
        //true
        System.out.println(i == j);
        char c = 12;
        //true
        System.out.println(i == c);
        float f = 12.0f;
        //true
        System.out.println(i == f);

        int k = 65;
        char a = 'A';
        //true
        System.out.println(k == a);

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        //false
        System.out.println(obj1 == obj2);

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1;
        //false
        System.out.println(p1 == p2);
        //true
        System.out.println(p1 == p3);
        //true
        System.out.println(p1.equals(p3));
    }
}
