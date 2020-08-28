package com.company828.methods;

public class TestArgsTransfer {
    public static void main(String[] args) {
        TestArgsTransfer tt = new TestArgsTransfer();
        String i="10";
        String j="5";
        tt.swap(i,j);
        System.out.println("m:" + i+" n:"+j);
    }

    //1.定义一个方法，交换两个变量的值
    public void swap(String m, String n){
        String temp=m;
        m=n;
        n=temp;
        System.out.println("m:" + m+" n:"+n);
    }

}
