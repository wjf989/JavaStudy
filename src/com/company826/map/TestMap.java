package com.company826.map;

import org.junit.Test;

import java.util.*;

/**
 *  Map接口
 *  *         |-----HashMap:Map的主要实现类
 *  *         |-----LinkedHashMap:使用链表维护添加进Map中的顺序。故遍历Map时，是按添加的顺序遍历的。
 *  *         |-----TreeMap:按照添加进Map中的元素的key的指定属性进行排序。要求：key必须是同一个类的对象！
 *  *                 针对key：自然排序   vs 定制排序
 *  *         |-----Hashtable:古老的实现类，线程安全，不建议使用。
 *  *             |----Properties:常用来处理属性文件。键和值都为String类型的
 */
public class TestMap {
    /**
     * Object put(Object key,Object value):向Map中添加一个元素
     *       Object remove(Object key):按照指定的key删除此key-value
     *       void putAll(Map t)
     *       void clear():清空
     *       Object get(Object key)：获取指定key的value值。若无此key，则返回null
     *       boolean containsKey(Object  key)
     *       boolean containsValue(Object value)
     *       int size():返回集合的长度
     *       boolean isEmpty() boolean equals(Object obj)
     *       HashMap： 1.key是用Set来存放的，不可重复。value是用Collection来存放的，可重复.
     *      一个key-value对，是一个Entry。所有的Entry是用Set存放的，也是不可重复的。
     *      2.向HashMap中添加元素时，会调用key所在类的equals()方法，判断两个key是否相同。若相同 则只能添加 进后添加的那个元素。
     */
    @Test
    public void testHashMap1(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("AA",213);
        map.put("BB",456);
        map.put("BB",45);
        map.put(123,"CC");
        map.put(null,null);
        map.put(new Person("DD",23),89);
        map.put(new Person("DD",23),87);
        System.out.println(map.size());
        System.out.println(map);
        map.remove("BB");
        System.out.println(map);
        Object value = map.get(123);
        System.out.println(value);
    }

    /**
     *  * 如何遍历Map Set keySet() Collection values() Set entrySet()
     */
    @Test
    public void testHashMap2(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("AA",213);
        map.put("BB",45);
        map.put(123,"CC");
        map.put(null,null);
        map.put(new Person("DD",23),89);
        // 1.遍历key集
        Set<Object> set = map.keySet();
        for (Object str : set) {
            System.out.println(str);
        }
        System.out.println();
        // 2.遍历value集
        Collection<Object> values = map.values();
//        for (Object value : values) {
//            System.out.println(value);
//        }
        Iterator<Object> it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // 3.如何遍历key-value对。
        // 方式一：
        Set<Object> set1 = map.keySet();
        for (Object o : set1) {
            System.out.println(o + "----->" +map.get(o));
        }
        System.out.println();
        // 方式二：
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }

    /**
     * **LinkedHashMap用法
     */
    @Test
    public void testLinkedHashMap(){
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        map.put("AA", 213);
        map.put("BB", 45);
        map.put(123, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);

        Set<Object> set1 = map.keySet();
        for (Object obj : set1) {
            System.out.println(obj + "----->" + map.get(obj));
        }
    }

    /**
     * **TreeMap用法:自然排序
     */
    @Test
    public void testTreeMap1(){
        TreeMap<Object, Object> map = new TreeMap<>();
        map.put(new Person("AA", 23), 89);
        map.put(new Person("MM", 22), 79);
        map.put(new Person("GG", 23), 99);
        map.put(new Person("JJ", 13), 69);

        Set set1 = map.keySet();
        for (Object obj : set1) {
            System.out.println(obj + "----->" + map.get(obj));
        }
    }

    /**
     * TreeMap用法:定制排序
     */
    @Test
    public void testTreeMap2(){
        Comparator com = (o1, o2) -> {
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
        };
        TreeMap map = new TreeMap(com);
        map.put(new Customer("AA", 1001), 87);
        map.put(new Customer("CC", 1001), 67);
        map.put(new Customer("MM", 1004), 77);
        map.put(new Customer("GG", 1002), 97);

        Set set1 = map.keySet();
        for (Object obj : set1) {
            System.out.println(obj + "----->" + map.get(obj));
        }
    }
}
