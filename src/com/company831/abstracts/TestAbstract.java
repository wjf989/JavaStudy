package com.company831.abstracts;

/**
 * * abstract:抽象的,可以用来修饰类、方法
 *  * 1.abstract修饰类：抽象类
 *  * 1)不可被实例化
 *  * 2)抽象类有构造器 (凡是类都有构造器)
 *  * 3)抽象方法所在的类，一定是抽象类。
 *  * 4)抽象类中可以没有抽象方法。
 *  *
 *  * 2.abstract修饰方法：抽象方法
 *  * 1)格式：没有方法体，包括{}.如：public abstract void eat();
 *  * 2)抽象方法只保留方法的功能，而具体的执行，交给继承抽象类的子类，由子类重写此抽象方法。
 *  * 3)若子类继承抽象类，并重写了所有的抽象方法，则此类是一个"实体类",即可以实例化
 *  * 4)若子类继承抽象类，没有重写所有的抽象方法，意味着此类中仍有抽象方法，则此类必须声明为抽象的！
 * * 3.abstract 不能用来修饰属性、构造器、private、final、static
 *  *
 */
public class TestAbstract {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();

        Worker worker = new Worker() {
            @Override
            void breath() {
                System.out.println("工人吸收新鲜空气");
            }
        };
        worker.eat();
        worker.breath();
        worker.setName("AA");
        System.out.println(worker.getName());
        System.out.println();

        Person p = new Student();//多态
        p.eat();
        p.walk();
        p.setName("BB");
        System.out.println(p.getName());

    }
}
