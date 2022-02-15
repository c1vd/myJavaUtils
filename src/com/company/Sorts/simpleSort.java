package com.company.Sorts;

import com.company.ArrayUtils.swap;

public class simpleSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    swap.Swap(i,j, arr);
                }
            }
        }
    }
}
