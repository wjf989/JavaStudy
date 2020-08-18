package com.company818_reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * * java.lang.Class:是反射的源头。
 * * 我们创建了一个类，通过编译（javac.exe）,生成对应的.class文件。之后我们使用java.exe加载（JVM的类加载器完成的）
 * * 此.class文件，此.class文件加载到内存以后，就是一个运行时类，存在在缓存区。那么这个运行时类本身就是一个Class的实例！
 * * 1.每一个运行时类只加载一次！
 * * 2.有了Class的实例以后，我们才可以进行如下的操作：
 * *     1）*创建对应的运行时类的对象
 * *     2）获取对应的运行时类的完整结构（属性、方法、构造器、内部类、父类、所在的包、异常、注解、...）
 * *     3）*调用对应的运行时类的指定的结构(属性、方法、构造器)
 * *     4）反射的应用：动态代理
 */
public class Reflect {
    /**
     * 实例化Class类对象（常见4方法）
     * （1）若已知具体的类，通过类的class属性获取，改方法最为安全可靠，程序性能最高
     * 实例：Class clazz = String.class;
     * (2) 已知某个类的实例，调用该实例的getClass()方法获取clas对象
     * 实例：Class clazz = "www".getClass();
     * （3）已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException
     * 实例：Class clazz = Class.forName("java.lang.String");
     * (4)其他方式
     * 实例：ClassLoader cl = this.getClass().getClassLoader();
     * Class clazz = cl.loadClass("类的全类名");
     */
    //1,在有反射以前，如何创建一个类的对象，并调用其中的方法、属性
    @Test
    public void test1() {
        Person p = new Person();
        p.setAge(10);
        p.setName("TangWei");
        System.out.println(p);
        p.show();
    }

    //2,有了反射，可以通过反射创建一个类的对象，并调用其中的结构
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        //1.创建clazz对应的运行时类Person类的对象
        Person p = clazz.newInstance();
        System.out.println(p);

        //2.通过反射调用运行时类的指定的属性
        //2.1
        Field f1 = clazz.getField("name");
        f1.set(p, "liudehua");
        System.out.println(p);
        //2.2
        Field f2 = clazz.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(p, 20);
        System.out.println(p);

        //3.通过反射调用运行时类的指定的方法
        Method m1 = clazz.getMethod("show");
        m1.invoke(p);

        Method m2 = clazz.getMethod("display", String.class);
        m2.invoke(p, "chn");
    }

    @Test
    public void test3() {
        Person p = new Person();
        Class<? extends Person> clazz = p.getClass();
        System.out.println(clazz);
    }


}
