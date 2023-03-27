package com.ansh;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int r, sum=0;
        while(num!=0)
        {
            r=num%10;
            sum=r+(sum*10);
            num/=10;
        }
        System.out.println(sum);
    }
}
