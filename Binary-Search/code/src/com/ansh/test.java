package com.ansh;

public class test {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
//        int low=0,high=numbers.length-1;
//        int mid=0,ans=0;
//        while(low<=high)
//        {
//            mid= low + (high-low)/2;
//            if(numbers[mid]<target)
//            {
//                ans=numbers[mid];
//                break;
//            }
//            else high=mid-1;
//        }
        int[] ans=new int[2];
        int i =0,j=numbers.length-1;
        while(numbers[i]+ numbers[j]!=target)
        {
            i=binaryIndex(numbers,j,target);
            j=binaryIndex(numbers,i,target);
        }
        System.out.println((i+1)+" "+(j+1));
    }

    static int binaryIndex(int[] arr,int high, int target)
    {
        int low=0;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]<target)
            {
                return mid;
            }
            else high=mid-1;
        }
        return -1;
    }

}
