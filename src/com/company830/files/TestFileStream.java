package com.company830.files;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * * 1.流的分类：
 * * 按照数据流向的不同：输入流  输出流
 * * 按照处理数据的单位的不同：字节流  字符流（处理的文本文件）
 * * 按照角色的不同：节点流（直接作用于文件的）  处理流
 * *
 * * 2.IO的体系
 * * 抽象基类            节点流（文件流）                                缓冲流（处理流的一种）
 * * InputStream        FileInputStream            BufferedInputStream
 * * OutputStream        FileOutputStream        BufferedOutputStream
 * * Reader            FileReader                BufferedReader
 * * Writer            FileWriter                BufferedWriter
 */
public class TestFileStream {
    // 从硬盘存在的一个文件中，读取其内容到程序中。使用FileInputStream
    // 要读取的文件一定要存在。否则抛FileNotFoundException
    @Test
    public void testFileInputStream1() throws Exception {
        // 1.创建一个File类的对象。
        File file = new File("hello1.txt");
        // 2.创建一个FileInputStream类的对象
        FileInputStream fis = new FileInputStream(file);
        // 3.调用FileInputStream的方法，实现file文件的读取。
        /*
         * read():读取文件的一个字节。当执行到文件结尾时，返回-1
         */
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        // 4.关闭相应的流
        fis.close();
    }

    // 使用try-catch的方式处理如下的异常更合理:保证流的关闭操作一定可以执行
    @Test
    public void testFileInputStream2() {
        // 2.创建一个FileInputStream类的对象
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileInputStream3() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            // 读取到的数据要写入的数组。
            byte[] b = new byte[5];
            // 每次读入到byte中的字节的长度
            int len;
            while ((len = fis.read(b)) != -1) {
                String str = new String(b, 0, len);
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
