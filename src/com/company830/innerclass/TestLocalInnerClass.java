package com.company830.innerclass;

public class TestLocalInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.getComparable();
        System.out.println();
        outer.getComparable1();
    }
}
class OuterClass{
    //局部内部类
    //如下的使用方式较少
    public void method1(){
        class  InnerClass{

        }
    }

    //常常使用一个方法，使其返回值为某个类或接口的对象。而这个类或接口在方法内部创建
    //使用方式一
    public Comparable getComparable(){
        //1.创建一个实现Comparable接口的类:局部内部类
        class MyComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        //2.返回一个实现类的对象
        return new MyComparable();
    }
    //使用方式二
    public Comparable getComparable1(){
        //返回一个实现Comparable接口的匿名内部类的对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
