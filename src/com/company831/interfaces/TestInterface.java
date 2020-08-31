package com.company831.interfaces;

/**
 * * 接口（interface） 
 * 是与类并行的一个概念
 *  * 1.接口可以看做是一个特殊的抽象类。是常量与抽象方法的一个集合，不能包含变量、一般的方法。
 *  * 2.接口是没有构造器的。
 *  * 3.接口定义的就是一种功能。此功能可以被类所实现（implements）。
 *  * 比如：class CC extends DD implements AA
 *  * 4.实现接口的类，必须要重写其中的所有的抽象方法，方可实例化。若没有重写所有的抽象方法，则此类仍为一个抽象类
 *  * 5.类可以实现多个接口。----java 中的类的继承是单继承的
 *  * 6.接口与接口之间也是继承的关系，而且可以实现多继承
 *  * >5,6描述的是java中的继承的特点。
 *  *
 */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(AA.I);
//        AA.I = 13;
    }
}

interface AA {
    //常量:所有的常量都用public static final修饰
    int I = 12;
    boolean FLAG = false;

    //  int i;
    //抽象方法:所有的都用public abstract修饰
    void method1();

    void method2();
}

abstract class BB implements AA {

}

class DD {

}

interface MM {
    void method3();
}

class CC extends DD implements AA, MM {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

//接口之间仍为继承关系！(多继承)
interface JJ extends MM, AA {
    void method4();
}

class GG implements JJ {

    @Override
    public void method3() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method4() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub

    }

}
