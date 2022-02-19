package com.myJUtils;

import com.myJUtils.ArrayUtils.printArray;
import com.myJUtils.Sorts.bubbleSort;

public class myJavaUtilsTest {
    public static void main(String[] args){
        int[] arr = new int[]{2432,432,65,423,4,32,432,4,23,4};
        bubbleSort.sort(arr);
        printArray.print(arr);

    }
}
