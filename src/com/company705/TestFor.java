package com.company705;

public class TestFor {
    public static void main(String[] args) {
        String[] str = new String[5];
        for (String s : str) {
            s = "atguigu";
            System.out.println(s);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println("i=" + i + "," + str[i]);
        }
    }
}
