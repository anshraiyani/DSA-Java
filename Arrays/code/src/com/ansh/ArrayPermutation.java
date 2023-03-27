package com.ansh;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(multipleIndex(index, index[i], i))
            {
                shift(ans,index[i]);
                ans[index[i]]=nums[i];
            }
            else ans[index[i]]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
//        System.out.println(multipleIndex(index,1,1));
    }

    static void shift(int[] ans, int n){
        for(int i=ans.length-1;i>=n;i--)
        {
            ans[i]=ans[i-1];
        }
    }

    static boolean multipleIndex(int[] index, int n, int i) {
        int count=0;
        if(i!=0)
        {
            for (int k = i-1; k >= 0; k--) {
                if (index[k] == n) count++;
            }
        }
        if(count>0) return true;
        else return false;
    }

}
