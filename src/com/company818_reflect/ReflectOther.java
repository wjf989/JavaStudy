package com.company818_reflect;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectOther {
    @Test
    //1.获取运行时类的父类
    public void test1() {
        Class<Person> clazz = Person.class;
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    //2.获取带泛型的父类
    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();
        System.out.println(type1);
    }

    //3.获取父类的泛型
    @Test
    public void test3() {
        Class<Person> clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();

        ParameterizedType param = (ParameterizedType) type1;
        Type[] ars = param.getActualTypeArguments();
        System.out.println(((Class) ars[0]).getName());
    }

    //4.获取实现的接口
    @Test
    public void test4() {

    }

    //5.获取所在的包
    public void test5() {

    }

    //6.获取注解
    public void test6() {

    }
}
