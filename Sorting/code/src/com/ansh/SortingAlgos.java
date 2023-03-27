package com.ansh;

import java.util.Arrays;

public class SortingAlgos {

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
//        BubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-1-i;
            int maxIndex=getMaxIndex(arr,last);
            swap(arr,maxIndex,last);
        }
    }

    static void InsertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else break;
            }
        }
    }

    static void CyclicSort(int[] arr){ // use when array starts from 0/1 till N
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }
    }

    static int getMaxIndex(int[] arr,int end)
    {
        int max=0;
        for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i]) max=i;
        }
        return max;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
