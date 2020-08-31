package com.company831.interfaces;

public class TestUSB {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.doWork(new Printer());

        Flash f = new Flash();
        com.doWork(f);

        //实现接口的匿名类的对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止连接");
            }

        };
        com.doWork(phone);

        System.out.println();
        //实现接口的匿名类的对象
        com.doWork(new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止连接");
            }
        });
    }
}

class Computer {
    public void doWork(USB usb) {
        usb.start();
        System.out.println("。。。此设备开始操作。。。");
        usb.stop();
    }
}

interface USB {
    //USB的尺寸的大小，可以设置为常量
    //功能设置为抽象方法
    void start();

    void stop();
}

//打印机
class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}

//U盘
class Flash implements USB {
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
