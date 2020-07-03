package com.company619;

public class Test {
  public static void main(String[] args) {
    Student student = new Student("张三", 119);//本态引用
    System.out.println(student.getId());
    System.out.println(student.getName());
    System.out.println(student.say());

    Person person = new Student("李四", 120);
//    System.out.println(person.getId()); //错误,Person类没有改方法,父类不能使用子类特有的方法
    System.out.println(((Student) person).getId()); // 正确, 通过将父类强转换为子类,从而可以调用子类的方法
    System.out.println(person.getName());
    System.out.println(person.say());  //虚方法调用,当子类和父类有同样方法时,优先调用子类方法.因为对象本身就是子类多态映射为父类的s

  }
}
