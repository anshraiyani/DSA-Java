package com.ansh;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,45,3,5,6},
                {6,7,8,33,4,49},
                {6,3}
        };
        int target = 49;
        int[] ans = serachIndex(arr, target);
        System.out.println(Arrays.toString(ans));
//        System.out.println(search(arr, target));
    }

    static int[] serachIndex(int[][] arr, int target){
        if(arr.length==0) return new int[]{-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }

    static boolean search(int[][] arr, int target)
    {
        if(arr.length==0) return false;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt == target) return true;
        return false;
    }

}


