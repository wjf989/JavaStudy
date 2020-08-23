package com.company818_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectConstructor {
    @Test
    public void test1() throws Exception {
        String className = "com.company818_reflect.Person";
        Class<?> clazz = Class.forName(className);
        //创建对应的运行时类的对象。使用newInstance()，实际上就是调用了运行时类的空参的构造器。
        //要想能够创建成功：①要求对应的运行时类要有空参的构造器。②构造器的权限修饰符的权限要足够。
        Object obj = clazz.newInstance();
        Person p = (Person) obj;
        p.setName("jc");
        System.out.println(p);

    }

    @Test
    public void test2() throws ClassNotFoundException {
        String className = "com.company818_reflect.Person";
        Class<?> clazz = Class.forName(className);
        Constructor<?>[] cons = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
    }

    //调用指定的构造器,创建运行时类的对象
    @Test
    public void test3() throws Exception {
        String className = "com.company818_reflect.Person";
        Class<?> clazz = Class.forName(className);
        Constructor<?> cons = clazz.getDeclaredConstructor(String.class, int.class);
        cons.setAccessible(true);
        Person p = (Person) cons.newInstance("往", 20);
        System.out.println(p);

    }
}
