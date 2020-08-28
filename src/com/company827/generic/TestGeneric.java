package com.company827.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGeneric {
    //1.在集合中没有使用泛型的情况下
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(89);
        list.add(87);
        list.add(67);
        //1.没有使用泛型，任何Object及其子类的对象都可以添加进来
        list.add(new String("AA"));
        for (Object o : list) {
            //2.强转为int型时，可能报ClassCastException的异常
            int score = (Integer)o;
            System.out.println(score);
        }
    }

    //2.在集合中使用泛型
    @Test
    public void test2(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(78);
        list1.add(87);
//        list1.add(new String("AA")); //由于使用了泛型限制，在进行编译之前就提示问题，从而防止在运行时出错
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    //3,自定义泛型类的使用
    @Test
    public void test3(){
        //1.当实例化泛型类的对象时，指明泛型的类型。
        //指明以后，对应的类中所有使用泛型的位置，都变为实例化中指定的泛型的类型
        //2.如果我们自定义了泛型类，但是在实例化时没有使用，那么默认类型是Object类的
//        Order order = new Order();
        Order<Object> order = new Order<>();
//        order.getT();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        List list = order.list;
        System.out.println(list);

        SubOrder o = new SubOrder();
        List list1 = o.list;
        System.out.println(list1);
        //当通过对象调泛型方法时，指明泛型方法的类型。
        Integer i = Order.getE(34);
        Double d = Order.getE(2.3);

        Integer[] in = new Integer[]{1,2,3};
        List list2 = new ArrayList<>();
        List list3 = order.fromArrayToList(in, list2);
        System.out.println(list3);
    }

    /**
     * 通配符  ?
     *      *  List< A > 、List< B > 、。。。。都是List< ? >的子类
     *      *
     *      *  ? extends A :可以存放A及其子类
     *      *  ? super A:可以存放A及其父类
     */
    @Test
    public void test4(){
        List < ? > list = null;
        List< Object > list1 = new ArrayList< Object >();
        List< String > list2 = new ArrayList< String >();
        list=list1;
        list=list2;
        show(list1);
        show1(list2);
        List< ? extends Number > list3 = null;
        List< Integer > list4 = null;
        list3 = list4;
        List< ? super Number > list5 = null;
        list5 = list1;

    }

    @Test
    public void test5(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        List<?> list1 = list;
        //可以读取声明为通配符的集合类的对象
        Iterator<?> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //不允许向声明为通配符的集合类中写入对象。唯一例外的是null
//        list1.add("123");
        list1.add(null);
        System.out.println(list1);
    }
    public void show(List<Object> list){

    }
    public void show1(List<?> list){

    }
}
