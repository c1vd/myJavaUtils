package com.myJUtils.Maths;

import java.util.ArrayList;

public class FibonacciNumber {
    public static int get(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        if(num==1){
            return arrayList.get(0);
        }else if(num==2){
            return arrayList.get(1);
        }else {
            for (int i = 2; i < num; i++) {
                arrayList.add(arrayList.get(i-1)+arrayList.get(i-2));
            }
            return arrayList.get(num-1);
        }
    }
}
