package com.company829.arryutils;

public class ArrayUtil {
    //1,求数组的最大值
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (max<i){
                max=i;
            }
        }
        return max;
    }
    //2,求数组的最小值
    public int getMin(int[] arr){
        int min=arr[0];
        for (int i : arr) {
            if (min>i){
                min=i;
            }
        }
        return min;
    }
    //3,遍历数组元素
    public void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("]");
    }
    //4,求数组的平均数
    public int avg(int[] arr){
        int sum = getSum(arr);
        return sum / arr.length;
    }
    //5,求数组的总和
    public int getSum(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        return sum;
    }
    //6,数组的反转
    public int[] reverse(int[] arr){
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }
    //7,实现数组的复制
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //8,对数组进行排序
    public void sort(int[] arr, String desc) {
        if (desc == "asc") {// ascend:从小到大
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr,j,j+1);
                        //swap(arr[j],arr[j + 1]);
                    }
                }
            }
        } else if (desc == "desc") {// 从大到小
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr,j,j+1);
                        //swap(arr[j],arr[j + 1]);
                    }
                }
            }
        } else {
            System.out.println("您输入的排序方式有误！");
        }
    }
    //9,交换数组中指定位置的元素:交换arr数组中索引为i和j的两个元素
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
