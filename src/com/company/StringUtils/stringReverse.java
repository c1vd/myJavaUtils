package com.company.StringUtils;

public class stringReverse {
    public static String reverse(String str){
        String res = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            res+=str.charAt(i);

        }
        return res;

    }
}
