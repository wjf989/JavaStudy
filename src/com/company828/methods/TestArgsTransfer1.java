package com.company828.methods;

//* 方法的参数传递（重点、难点）
//  * 1.形参：方法声明时，方法小括号内的参数
//  *   实参：调用方法时，实际传入的参数的值
//  *
//  * 2.规则：java中的参数传递机制：值传递机制
//  *   1）形参是基本数据类型的：将实参的值传递给形参的基本数据类型的变量
//  *   2）形参是引用数据类型的：将实参的引用类型变量的值（对应的堆空间的对象实体的首地址值）传递给形参的引用类型变量。
//  *
public class TestArgsTransfer1 {
    public static void main(String[] args) {
        TestArgsTransfer1 tt = new TestArgsTransfer1();
        DataSwap ds = new DataSwap();
        System.out.println("ds.i:" + ds.i + " ds.j:" + ds.j);

        tt.swap(ds);
        System.out.println(ds);
        System.out.println("ds.i:" + ds.i + " ds.j:" + ds.j);
    }

    public void swap(DataSwap d) {
        int temp=d.i;
        d.i=d.j;
        d.j=temp;
        System.out.println(d);//打印引用变量d的值
    }

    static class DataSwap {
        int i = 10;
        int j = 5;
    }
}

