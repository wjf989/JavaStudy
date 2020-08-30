package com.company830.innerclass;

public class Person {
    String name = "韩梅梅";
    int age;
    //成员内部类(非static的)
    class Bird{
        String name = "黄鹂";
        int id;
        public Bird(){}

        public void setName(String name){
            System.out.println(name);//杜鹃
            System.out.println(this.name);//黄鹂
            System.out.println(Person.this.name);//韩梅梅
        }

        public void info(){
            show();
        }
    }

    //成员内部类(静态内部类)
    static class Dog{

    }
    private void show() {
        System.out.println("我是show()方法");
    }

    public void method1(){
        class A{

        }
    }
}
