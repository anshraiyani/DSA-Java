package com.ansh;

import java.util.Arrays;

import static com.ansh.SortingAlgos.swap;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(Arrays.toString(cyclic(arr)));

    }

    static int[] cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

}


