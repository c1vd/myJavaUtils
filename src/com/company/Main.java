package com.company;


import com.company.ArrayUtils.arrayReverse;
import com.company.ArrayUtils.printArray;
import com.company.Maths.*;
import com.company.Sorts.bubbleSort;
import com.company.Sorts.selectionSort;
import com.company.Sorts.simpleSort;
import com.company.StringUtils.palindrome;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,2,6,7,3,8,3,8,34,9,4,8,4,9,4,9,4,9,4,8,4,9,54};
        simpleSort.sort(arr);
        arrayReverse.reverse(arr);
        printArray.print(arr);
        System.out.println(FibonacciNumber.get(6));
        System.out.println(Pow.pow(5,3));


    }
}
