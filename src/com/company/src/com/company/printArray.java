package com.company;

public class printArray {
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void print(String[] arr){
        for (String j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
