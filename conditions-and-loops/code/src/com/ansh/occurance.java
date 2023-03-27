package com.ansh;

import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = in.nextInt();
        System.out.println("Enter multiple occurance num:");
        int occ = in.nextInt();
        int temp=num;
        int count = 0;
        int r;
        while(temp!=0)
        {
            r=temp%10;
            if(occ==r)
            {
                count++;
            }
            temp=(temp/10);
        }
        System.out.println(count);
    }
}
