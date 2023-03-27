package com.ansh;

public class Main {

    public static void main(String[] args) {
        print(1,100);
    }

    static void print(int n,int k){
        if(n==k){
            System.out.println(k);
            return;
        }
        System.out.println(n);
        print(n+1,k);
    }

}
