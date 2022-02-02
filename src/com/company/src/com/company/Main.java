package com.company;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"1","242","2","4","5"};
        int[] arr2 = new int[]{3,220,72,4,5};
        bubbleSort.sort(arr2);
        printArray.print(arr2);
        arrayReverse.reverse(arr);
        printArray.print(arr);

    }
}
