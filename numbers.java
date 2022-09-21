package com.recursion;

public class numbers {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print1(n+1);

    }

//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//
//    }
}
