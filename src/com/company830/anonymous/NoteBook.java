package com.company830.anonymous;

public class NoteBook implements Product {

    @Override
    public void getName() {
        System.out.println("HP笔记本");
    }

    @Override
    public void getPrice() {
        System.out.println("￥5000");
    }
}
