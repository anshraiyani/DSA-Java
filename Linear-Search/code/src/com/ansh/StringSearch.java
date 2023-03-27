package com.ansh;

public class StringSearch {
    public static void main(String[] args) {
        String name="Ansh";
        char target = 'd';
        System.out.println(search(name,target));
    }

    static boolean search(String s, char target)
    {
        if(s.length()==0) return false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==target) return true;
        }
        return false;
    }

}
