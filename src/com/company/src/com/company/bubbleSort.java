package com.company;

public class bubbleSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
