package com.ansh;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[][];
//      NOTE: giving rows is a necessary condition for an 2d array (columns need not be specified)
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
//        output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        output 2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
