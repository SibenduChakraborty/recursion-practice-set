package com.recursiontut;
import java.util.Scanner;
public class printnumber {
    static void print(int n , int target){
        if(n==target){
            return;
        }
        //System.out.println(n);
        print(n+1,target);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        print(n,target);
    }
}