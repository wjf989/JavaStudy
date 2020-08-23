package com.company818_reflect;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectProperty {
    //1,获取对应的运行时类的属性
    @Test
    public void test1() {
        Class<Person> clazz = Person.class;
        //1,getFields():只能获取到运行时类中及其父类中声明为public的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("\n");
        //2,getDeclareFields:获取运行时类本身声明的所有的属性
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
    }

    //2,权限修饰符  变量类型 变量名
    //获取属性的各个部分的内容
    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            //1.获取每个属性的权限修饰符
            int i = f.getModifiers();
            String str = Modifier.toString(i);
            System.out.print(StringUtils.isBlank(str) ? str : str + " ");
            //2.获取属性的类型
            Class<?> type = f.getType();
            System.out.print(type.getName() + " ");
            //3.获取属性名
            System.out.print(f.getName());

            System.out.println();
        }
    }

    //3，调用运行时类中指定的属性
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;
        //1,获取指定的属性
        //getField(String fieldName):获取运行时类中声明为public的指定属性名为fieldName的属性
        Field name = clazz.getField("name");
        //2，创建运行时类的对象
        Person p = clazz.newInstance();
        System.out.println(p);
        //3,将运行时类的指定的属性赋值
        name.set(p, "Jerry");
        System.out.println(p);
        System.out.println("%" + name.get(p));
        System.out.println();

        //getDeclaredField(String fieldName):获取运行时类中指定的名为fieldName的属性
        Field age = clazz.getDeclaredField("age");
        //由于属性权限修饰符的限制，为了保证可以给属性赋值，需要在操作前使得此属性可被操作。
        age.setAccessible(true);
        age.set(p, 10);
        System.out.println(p);
    }

}
