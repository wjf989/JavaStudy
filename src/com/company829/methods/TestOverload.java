package com.company829.methods;

/**
 * * 方法的重载（overload）
 *  * 要求：1.同一个类中 2.方法名必须相同 3.方法的参数列表不同（①参数的个数不同②参数类型不同）
 *  * 补充：方法的重载与方法的返回值类型没有关系！
 */
public class TestOverload {
    //定义两个int型变量的和
    public int getSum(int i,int j){
        return i + j;
    }
    //定义三个int型变量的和
    public int getSum(int i,int j,int k){
        return i + j + k;
    }
    //不能与其它几个方法构成重载
//    public int getSum1(int i,int j,int k){
//        return i + j + k;
//    }
//    public void getSum(int i,int j,int k){
//        System.out.println(i + j + k);
//    }
    //定义两个double型数据的和
    public double getSum(double d1,double d2){
        return d1 + d2;
    }

    //定义三个double型数组的和
    public void getSum(double d1,double d2,double d3){
        System.out.println(d1 + d2 + d3);
    }
    //以下的两个方法构成重载。
    public void method1(int i,String str){

    }
    public void method1(String str1,int j){

    }

}
