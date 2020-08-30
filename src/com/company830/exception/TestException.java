package com.company830.exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * * java.lang.Throwable
 * *         |-----Error:错误，程序中不进行处理
 * *         |-----Exception:异常，要求在编写程序时，就要考虑到对这些异常的处理
 * *                 |-----编译时异常：在编译期间会出现的异常（执行javac.exe命令时，出现异常）
 * *                 |-----运行时异常：在运行期间出现的异常(执行java.exe命令时，出现异常)
 * *
 * * 当执行一个程序时，如果出现异常，那么异常之后的代码就不再执行！
 */
public class TestException {
    //编译时异常
    @Test
    public void test6() {
        FileInputStream fis =null;
        try{
            fis = new FileInputStream(new File("hello.txt"));
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
        }catch (FileNotFoundException e){
            System.out.println("文件找不到了！");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //常见的运行时异常
    //4.空指针异常：NullPointerExcetion
    @Test
    public void test5() {
//        Person p = new Person();
//        p = null;
//        System.out.println(p.toString());
        try {
            String str = new String("AA");
            str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("出现空指针的异常了");
        }

    }

    //3.类型转换异常：ClassCastException
    @Test
    public void test4() {
        try {
            Object obj = new Date();
            String str = (String) obj;
            //String str1 = (String)new Date();
        } catch (ClassCastException e) {
            System.out.println("出现类型转换的异常了");
            //System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello!美女！");
        }

    }

    //2.算术异常：ArithmeticException
    @Test
    public void test3() {
        try {
            int i = 10;
            System.out.println(i / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    //1.数组下标越界的异常:ArrayIndexOutOfBoundsException
    @Test
    public void test2() {
        try {
            int[] i = new int[10];
            //System.out.println(i[10]);
            System.out.println(i[-10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    @Test
    //0.类型不匹配的异常
    public void test1() {
        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("出现类型不匹配的异常了！");
        }

    }

}

class Person {
}