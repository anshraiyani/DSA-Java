package com.ansh;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        binarySearchRecursion(arr,0,arr.length-1,4);
    }

    static void binarySearchRecursion(int[] arr,int low,int high,int target){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("element found at index: "+mid);
                return;
            }
            else if(arr[mid]>target){
                binarySearchRecursion(arr,low,mid-1,target);
            }
            else{
                binarySearchRecursion(arr,mid+1,high,target);
            }
        }
        else{
            System.out.println("element not found");
        }
    }

}
