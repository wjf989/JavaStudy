package com.company827.polymorphic;

public class TestPoly {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.walk();
        System.out.println();
        Man m = new Man();
        m.eat();
        m.walk();
        System.out.println();
        // 子类对象的多态性：父类的引用指向子类对象
        Person p1 = new Man(); //向上转型
        // 虚拟方法调用：通过父类的引用指向子类的对象实体，当调用方法时，实际执行的是子类重写父类的方法
        p1.eat();
        p1.walk();
        System.out.println("$" + p1.id);//1001
        System.out.println();

        Person p2 = new Woman();
        p2.eat();
        p2.walk();
        System.out.println();

        Woman w = (Woman) p2;// 向下转型,使用强转符：()
        w.shopping(); //等价于 ((Woman) p2).shopping();
        System.out.println();
//        Woman w1 = (Woman) p1;
//        w1.shopping(); // 抛异常：java.lang.ClassCastException: com.company827.polymorphic.Man cannot be cast to com.company827.polymorphic.Woman

//        Woman w2 = (Woman) new Man(); //不能转换，因为2者没有直接的必然联系
        // instanceof:
        // 格式： 对象a instanceof 类A：判断对象a是否是类A的一个实例.是的话，返回true；否则返回false
        // 若a是A类的实例，那么a也一定是A类的父类的实例。
        if (p1 instanceof Woman){
            System.out.println("hello");
            Woman w1 = (Woman) p1;
            w1.shopping();
        }
        if (p1 instanceof Man){
            System.out.println("work");
            Man m1 = (Man) p1;
            m1.entertainment();
        }
        if (p1 instanceof Person){
            System.out.println("你好！");
        }
    }
    public void show(Person person){}
}
