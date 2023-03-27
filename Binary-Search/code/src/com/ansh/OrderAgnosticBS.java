package com.ansh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {99,55,45,36,23,1,-56,-789,-4205};
        int[] arr = {-89,-5,6,45,89,108,860,4566,5615};
        int target=-5;
        if(isIncreasing(arr)) System.out.println(increasinBS(arr,target));
        else System.out.println(decreasinBS(arr, target));
    }

    static boolean isIncreasing(int[] arr)
    {
        return arr[0]<arr[arr.length-1];
    }

    static int increasinBS(int[] arr, int target)
    {
        int low=0, high= arr.length-1;
        while(low<=high)
        {
//            int mid=(low+high)/2;
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) low=mid+1;
            if(arr[mid]>target) high=mid-1;
        }
        return -1;
    }

    static int decreasinBS(int[] arr, int target)
    {
        int low=0, high= arr.length-1;
        while(low<=high)
        {
//            int mid=(low+high)/2;
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) high=mid-1;
            if(arr[mid]>target) low=mid+1;
        }
        return -1;
    }

}
