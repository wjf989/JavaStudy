package com.company612;

public class TestTransfer1 {
  public static void swap(DataSwap ds) {
    int tmp = ds.a;
    ds.a = ds.b;
    ds.b = tmp;
    System.out.println("swap方法里，a Field的值是"
      + ds.a + "；b Field的值是" + ds.b);

  }

  public static void main(String[] args) {
    DataSwap ds = new DataSwap();
    ds.a = 6;
    ds.b = 9;
    swap(ds);
    System.out.println("交换结束后，a Field的值是"
      + ds.a + "；b Field的值是" + ds.b);

  }
}
