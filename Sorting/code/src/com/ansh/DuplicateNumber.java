package com.ansh;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;

        }
        for (int index = 0; index < arr.length; index++) {
                if(arr[index]!=index+1) return arr[index];
        }
        return -1;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
