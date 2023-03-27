package com.ansh;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        function(2,3,4,5,4,6,7,8,9,10);
    }

    static void function(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

}
