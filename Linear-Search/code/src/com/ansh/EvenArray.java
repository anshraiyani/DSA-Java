package com.ansh;

public class EvenArray {
    public static void main(String[] args) {
        int[] arr = {1,-18, 56, 456, 1089, 5644};
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] arr)
    {
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            if(isEven(arr[i])) even++;
        }
        return even;
    }

//    static boolean isEven(int num)
//    {
//        if(num<0) num*=(-1);
//        int count=0, r;
//        while(num!=0)
//        {
//            r=num%10;
//            num/=10;
//            count++;
//        }
//        if(count%2==0);
//    }

    static boolean isEven(int num)
    {
        if(num<0) num*=(-1);
        String s = num + "";
        return  (s.length()%2==0);
    }

}
