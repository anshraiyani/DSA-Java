package com.ansh;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 13; i++) {
            System.out.print((fibonacci(i))+" ");
        }
    }

    static int fibonacci(int i){
        if(i==0 || i==1){
            return i;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }

}
