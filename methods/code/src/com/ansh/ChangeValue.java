package com.ansh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums)
    {
        nums[0]=10;
    }

}
