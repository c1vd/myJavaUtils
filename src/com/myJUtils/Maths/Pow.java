package com.myJUtils.Maths;

public class Pow {
    public static long pow(int num, int n){
        long num2 = num;
        for (int i = 1; i < n; i++) {
            num2*=num;
        }
        return num2;
    }
}
