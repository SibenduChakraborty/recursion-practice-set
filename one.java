package com.recursiontut;

public class one {
    public static void main(String[] args) {
        int n=0;
        print(n);
//        print1();
//        print2();
//        print3();
    }

    static void print(int n){
        if(n==5) {
            return;
        }
        print(n+1);
        System.out.println(n);
    }
//    static void print1(){
//        System.out.println("hello 1" );
//        print2();
//    }
//    static void print2(){
//        System.out.println("hello 2");
//        print3();
//    }
//    static void print3(){
//        System.out.println("hello 3");
//    }
}
//
//main
//print
//print 1
//print 2
//print 3
//print 4
//
//
