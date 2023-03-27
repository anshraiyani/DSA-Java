package com.ansh;

import static com.ansh.SortingAlgos.swap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr={1,2,0};
        System.out.println(cyclic(arr));
    }

    static int cyclic(int[] nums){
        int i=0;
        while(i< nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]!=nums[correct] && nums[i]<=nums.length){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return index+1;
            }
        }

        return nums.length+1;
    }

}
