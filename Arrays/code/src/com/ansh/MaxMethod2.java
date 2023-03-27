package com.ansh;

public class MaxMethod2 {
    public static void main(String[] args) {
        int[] arr={5,30,7,8,111,4,65,6,45,789,1002};
        System.out.println(Max(arr));
        System.out.println(MaxRange(arr, 2,6));
    }

    static int MaxRange(int[] arr, int a, int b) {
        int max = arr[a];
        for (int i = a+1; i <= b; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
