package com.ansh;

public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        x=10;
        System.out.println(x);
        function();
    }

    static void function()
    {
        x=5;
        System.out.println(x);
    }
}
