package com.company.Maths;

public class Min {
    public static int min(int[] arr){
        int minN = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minN>arr[i]){
                minN=arr[i];
            }
        }
        return minN;
    }
}
