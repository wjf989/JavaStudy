package com.company826.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    /**
     *  *  reverse(List)：反转 List 中元素的顺序
     *         shuffle(List)：对 List 集合元素进行随机排序
     *         sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
     *         sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
     *         swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
     */
    @Test
    public void testCollections1(){
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(12);
        list.add(78);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println(list);
    }

    /**
     *  *  Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
     *         Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
     *         Object min(Collection)
     *         Object min(Collection，Comparator)
     *         int frequency(Collection,Object)：返回指定集合中指定元素的出现次数
     *         void copy(List dest,List src)：将src中的内容复制到dest中
     *         boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     */
    @Test
    public void testCollections2(){
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(12);
        list.add(78);
        list.add(456);
        Object obj = Collections.max(list);
        System.out.println(obj);
        int count = Collections.frequency(list, 4567);
        System.out.println(count);
        //实现List的复制
        List list1 = new ArrayList();//方式1
        list1.addAll(list);
        System.out.println("list1:" + list1);
//        List list1 = Arrays.asList(new Object[list.size()]);
//        Collections.copy(list1, list); // 方式2
//        System.out.println(list1);
        //通过如下的方法保证list的线程安全性。
        List list2 = Collections.synchronizedList(list);
        System.out.println("list2:" + list2);
    }
}
