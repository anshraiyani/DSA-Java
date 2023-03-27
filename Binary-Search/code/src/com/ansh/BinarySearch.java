package com.ansh;

public class BinarySearch {

    public static void main(String[] args) {
	    int[] arr = {-89,-5,6,45,89,108,860,4566,5615};
        System.out.println(binarySearch(arr, 4566));
    }

    static int binarySearch(int[] arr, int target)
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

}
