package com.company.Maths;

public class Max {
    public static int max(int[] arr){
        int maxN = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxN<arr[i]){
                maxN=arr[i];
            }
        }
        return maxN;
    }
}
