package com.ansh;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(search(arr,11)));
    }

    static int[] search(int[][] arr,int target){
        // using imaginary pointers to consider the 2d array as a single array, then applying binary search to it
        int low=0,high=arr.length*arr[0].length;
        while (low<=high){
            int mid=low+(high-low)/2;
            // row index = imaginary index/ row size
            // col index = imaginary index % col size
            if(arr[mid/ arr.length][mid%arr[0].length]==target) return new int[]{mid/ arr.length,mid% arr[0].length};
            if(arr[mid/arr.length][mid%arr[0].length]>target) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }

}
