//package com.ansh;
//
//public class FirstAndLast {
//    public static void main(String[] args) {
//        int[] arr={5,7,7,7,7,8,8,10};
//        System.out.println(BSindex(arr,7,0, arr.length-1,true));
//
//    }
//
//    static int BSindex(int[] arr,int target,int low,int high,boolean first){
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(arr[mid]==target){
//                if(first){
//                    BSindex(arr,target,low,mid-1,first);
//                }
//                else
//            }
//            else if(arr[mid]>target) high=mid-1;
//            else low=mid+1;
//        }
//        return low;
//    }
//
//}