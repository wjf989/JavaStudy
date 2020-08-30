package com.company830.innerclass;

/**
 * * 类的第5个成员：内部类
 * <p>
 * <p>
 * * 1.相当于说，我们可以在类的内部再定义类。外面的类：外部类。里面定义的类：内部类
 * * 2.内部类的分类：成员内部类（声明在类内部且方法外的）  vs 局部内部类(声明在类的方法里)
 * * 3.成员内部类：
 * *         3.1是外部类的一个成员：①可以有修饰符（4个）②static final ③可以调用外部类的属性、方法
 * *
 * *         3.2具体类的特点：①abstract ②还可以在其内部定义属性、方法、构造器
 * *
 * * 4.局部内部类：
 * *
 * * 5.关于内部类，大家掌握三点：
 * *   ①如何创建成员内部类的对象（如：创建Bird类和Dog类的对象）
 * *   ②如何区分调用外部类、内部类的变量(尤其是变量重名时)
 * *   ③局部内部类的使用 （见TestInnerClass1.java）
 * *
 */
public class TestInnerClass {
    public static void main(String[] args) {
        //创建静态内部类的对象：可以直接通过外部类调用静态内部类的构造器
        Person.Dog d = new Person.Dog(); //Person.new Dog();
//        Person.Bird bird = new Person.Bird(); //抛出异常：Bird不是Person中的静态内部类，只是一个普通内部类


        //创建非静态的内部类的对象：必须先创建外部类的对象，通过外部类的对象调用内部类的构造器
        Person.Bird bird = new Person().new Bird(); //正常运行，因为通过构造函数进行了实例化
        bird.info();
        bird.setName("杜鹃");
    }
}
