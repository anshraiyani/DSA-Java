package com.ansh;

public class MaxMethod1 {
    public static void main(String[] args) {
        int[] arr={45,3,6,8,110};
        System.out.println(Max(arr));
    }

    static int Max(int[]arr)
    {
        int a=0,b=0;
        for (int i = 0; i < arr.length-1; i++) {
            b=a+1;
            if(arr[a]>arr[b]) {
                swap(arr, a, b);
            }
            a++;
        }
        return arr[arr.length-1];
    }

    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
