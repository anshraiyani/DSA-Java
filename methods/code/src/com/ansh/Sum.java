package com.ansh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        System.out.println(sum2());
        System.out.println(sum3(3,4));
    }

    static int sum3(int a, int b)
    {
        return a+b;
    }


    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=a+b;
        return c;

    }

    static void sum()
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=a+b;
        System.out.println(c);
    }
}
