package com.company831.interfaces;

//接口与具体的实现类之间也存在多态性
public class TestInterface2 {

    public static void main(String[] args) {
        Duck d = new Duck();
        TestInterface2.test1(d);
        TestInterface2.test2(d);
        TestInterface2.test3(d);
    }

    public static void test1(Runner r) {
        r.run();//虚拟方法调用
    }

    public static void test2(Swimmer s) {
        s.swim();
    }

    public static void test3(Flier f) {
        f.fly();
    }
}

interface Runner {
    void run();
}

interface Swimmer {
    void swim();
}

interface Flier {
    void fly();
}

class Duck implements Runner, Swimmer, Flier {

    @Override
    public void fly() {
        System.out.println("丑小鸭也可以变成白天鹅！");
    }

    @Override
    public void swim() {
        System.out.println("红掌拨清波");
    }

    @Override
    public void run() {
        System.out.println("鸭子屁股扭扭的走路");
    }

}
