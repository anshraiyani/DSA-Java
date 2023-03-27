package com.ansh;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 45, 89, 4, 3};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
