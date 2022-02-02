package com.company.ArrayUtils;

public class find {
    public static int Find(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static int rFind(int[] arr, int a){
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
}
