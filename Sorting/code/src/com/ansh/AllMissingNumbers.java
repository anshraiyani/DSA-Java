package com.ansh;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(missing(arr));
    }

    static List<Integer> missing(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i] -1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1) ans.add(index+1);
        }
        return ans;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}


