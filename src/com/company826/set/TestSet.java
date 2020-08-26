package com.company826.set;

import org.junit.Test;

import java.util.*;

/**
 * * Collection接口 ：
 * *         |------List接口：
 * *             |------ArrayList（主要的实现类）、
 * *             |------LinkedList（对于频繁的插入、删除操作）、
 * *             |------Vector（古老的实现类、线程安全的，但效率要低于ArrayList）
 * *         |------Set接口：存储无序的，不可重复的元素.Set中常用的方法都是Collection下定义的。
 * *                     |------HashSet(主要实现类)
 * |------LinkedHashSet
 * |------TreeSet
 */
public class TestSet {
    /* ---------------------------------------------------------------------------------------------------------------
     * Set:存储的元素是无序的，不可重复的！
     *      *  1.无序性：无序性！= 随机性。真正的无序性，指的是元素在底层存储的位置是无序的。
     *      * 2.不可重复性：当向Set中添加进相同的元素的时候，后面的这个不能添加进去。
     *      *
     *      * 说明：要求添加进Set中的元素所在的类，一定要重写equals()和hashCode()方法。 进而保证Set中元素的不可重复性！
     *      *
     *      * Set中的元素时如何存储的呢？使用了哈希算法。
     *      * 当向Set中添加对象时，首先调用此对象所在类的hashCode()方法，计算此对象的哈希值，此哈希值
     *      * 决定了此对象在Set中的存储位置。若此位置之前没有对象存储，则这个对象直接存储到此位置。若此位置
     *      * 已有对象存储，再通过equals()比较这两个对象是否相同。如果相同，后一个对象就不能再添加进来。 万一返回false呢，都存储。（不建议如此）
     *      * >要求：hashCode()方法要与equals()方法一致。
     */
    @Test
    public void testHashSet() {
        Set set = new HashSet<>();
        set.add(123);
        set.add(456);
        set.add(new String("AA"));
        set.add(new String("AA"));
        set.add("BB");
        set.add(null);

        System.out.println(set);
        System.out.println();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        Person p1 = new Person("GG", 23);
        Person p2 = new Person("GG", 23);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1.compareTo(p2));

        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
        System.out.println(set);
    }

    /**
     *  * LinkedHashSet:使用链表维护了一个添加进集合中的顺序。导致当我们遍历LinkedHashSet集合
     *      * 元素时，是按照添加进去的顺序遍历的！
     *      *
     *      * LinkedHashSet插入性能略低于 HashSet，但在迭代访问 Set 里的全部元素时有很好的性能。
     */
    @Test
    public void testLinkedHashSet(){
        Set set = new LinkedHashSet<>();
        set.add(123);
        set.add(456);
        set.add(new String("AA"));
        set.add(new String("AA"));
        set.add("BB");
        set.add(null);
        System.out.println(set);
        System.out.println();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * * TreeSet: 1.向TreeSet中添加的元素必须是同一个类的。
     *      * 2.可以按照添加进集合中的元素的指定的顺序遍历。像String，包装类等默认按照从小到大的顺序遍历。
     *      * 3.当向TreeSet中添加自定义类的对象时，有两种排序方法：①自然排序②定制排序
     *      * 4.自然排序：要求自定义类实现java.lang.Comparable接口并重写其compareTo(Object obj)的抽象方法
     *      * 在此方法中，指明按照自定义类的哪个属性进行排序。
     *      *
     *      * 5.向TreeSet中添加元素时，首先按照compareTo()进行比较，一旦返回0，虽然仅是两个对象的此
     *      * 属性值相同，但是程序会认为这两个对象是相同的，进而后一个对象就不能添加进来。
     *      *
     *      * >compareTo()与hashCode()以及equals()三者保持一致！
     */
    @Test
    public void testTreeSet1(){
        Set set = new TreeSet();
        // 当Person类没有实现Comparable接口时，当向TreeSet中添加Person对象时，报ClassCastException
        set.add(new Person("CC", 23));
        set.add(new Person("MM", 21));
        set.add(new Person("GG", 25));
        set.add(new Person("JJ", 24));
        set.add(new Person("KK", 20));
        set.add(new Person("DD", 20));
        for (Object o : set) {
            System.out.println(o);
        }
    }

    /**
     * * TreeSet的定制排序： 见下面的步骤 compare()与hashCode()以及equals()三者保持一致！
     */
    @Test
    public void testTreeSet2(){
        // 1.创建一个实现了Comparator接口的类对象
        Comparator com = new Comparator(){
            // 向TreeSet中添加Customer类的对象，在此compare()方法中，指明是按照Customer
            // 的哪个属性排序的
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i==0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    return i;
                }
                return 0;
            }
        };

        // 2.将此对象作为形参传递给TreeSet的构造器中
        TreeSet set = new TreeSet(com);
        // 3.向TreeSet中添加Comparator接口中的compare方法中涉及的类的对象。
        set.add(new Customer("AA", 1003));
        set.add(new Customer("BB", 1002));
        set.add(new Customer("GG", 1004));
        set.add(new Customer("CC", 1001));
        set.add(new Customer("DD", 1001));

        for (Object str : set) {
            System.out.println(str);
        }
    }
}
