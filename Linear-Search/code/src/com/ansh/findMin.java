package com.ansh;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {12,45,55,3,78,-56,2,3};
        System.out.println(min(arr));
    }

    static int min(int[] arr)
    {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }

}
