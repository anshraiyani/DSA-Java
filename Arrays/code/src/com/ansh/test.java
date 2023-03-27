package com.ansh;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        int sum=0;
        for(int i=0;i< num.length;i++)
        {
            sum=sum*10+num[i];
        }
        int k=34;
        sum+=k;
        System.out.println(sum);
        int r=0, temp=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(sum>0)
        {
            r=sum%10;
            temp=temp*10+r;
            sum/=10;
        }
        System.out.println(temp);
    }
}
