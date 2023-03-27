package com.ansh;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s = "   Naman";
        System.out.println(isPalindrom(s));
    }

    static boolean isPalindrom(String str){
        if(str.length() == 0 || str == null) return true;
        str=str.toLowerCase().trim();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

}
