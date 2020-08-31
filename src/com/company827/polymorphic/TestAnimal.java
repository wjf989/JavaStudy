package com.company827.polymorphic;

/**
 * @author Administrator
 */
public class TestAnimal {
    public static void main(String[] args) {
        TestAnimal t = new TestAnimal();
        t.func(new Animal());
        t.func(new Dog());
        t.func(new Cat());
    }

    public void func(Animal a) {
        a.eat();
        a.jump();
        if (a instanceof Dog) {
            ((Dog) a).wang();
        }
        if (a instanceof Cat) {
            ((Cat) a).catchMouse();
        }
    }
}

class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("进食");
    }

    public void jump() {
        System.out.println("跳");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃食");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void wang() {
        System.out.println("汪汪叫");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
