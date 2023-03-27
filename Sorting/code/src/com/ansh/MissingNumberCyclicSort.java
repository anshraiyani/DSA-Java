package com.ansh;

public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr={3,0,2,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index) return index;
        }
        return arr.length;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
