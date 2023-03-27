package com.ansh;

public class Cieling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 7;

        System.out.println(ceiling(arr,target));

    }

//    static int ceiling(int[] arr, int target)
//    {
//        int low=0, high= arr.length-1;
//        if(target>arr[high]) return -1;
//        while(low<=high)
//        {
////            int mid=(low+high)/2;
//            int mid = low + (high-low)/2;
//            if(arr[mid]==target) return arr[mid];
//            if(arr[mid]<target) low=mid+1;
//            if(arr[mid]>target) high=mid-1;
//        }
//        target++;
//        return ceiling(arr, target);
//    }
    static int ceiling(int[] arr, int target)
    {
        int low=0, high= arr.length-1;
        if(target>arr[high]) return -1;
        while(low<=high)
        {
//            int mid=(low+high)/2;
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return arr[mid];
            if(arr[mid]<target) low=mid+1;
            if(arr[mid]>target) high=mid-1;
        }
        return low;
    }

}
