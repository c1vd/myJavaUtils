package com.myJUtils.Sorts;

import com.myJUtils.ArrayUtils.swap;

public class bubbleSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    swap.Swap(j,j-1,arr);
                }
            }
        }
    }
}
