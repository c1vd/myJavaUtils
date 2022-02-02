package com.company.ArrayUtils;

public class swap {
    public static void Swap(int i1,int i2, int[] arr){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static void Swap(int i1,int i2, String[] arr){
        String temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
