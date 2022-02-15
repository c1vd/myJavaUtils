package com.company.ArrayUtils;

public class arrayReverse {
    public static void reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            swap.Swap(array.length-i-1,i,array);

        }
    }
    public static void reverse(String[] array){
        for (int i = 0; i < array.length/2; i++) {
            swap.Swap(array.length-i-1,i,array);
        }
    }
}
