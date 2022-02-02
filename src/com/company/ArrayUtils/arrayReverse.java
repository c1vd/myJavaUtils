package com.company.ArrayUtils;

public class arrayReverse {
    public static void reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i]=temp;

        }
    }
    public static void reverse(String[] array){
        for (int i = 0; i < array.length/2; i++) {
            String temp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i]=temp;

        }
    }
}
