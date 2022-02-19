package com.myJUtils.Sorts;

import com.myJUtils.ArrayUtils.swap;

public class selectionSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            swap.Swap(i, min, arr);
        }
    }
}
