package com.recursion;
import  java.util.Scanner;
public class factorial {
    public static long mult(int num)
    {
        if (num >= 1)
            return num * mult(num - 1);
        else
            return 1;
    }
    static long zerocount(long num, int count){
        if(num%10==0){
            count++;
            return zerocount(num/10,count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = 7;
        long factorial = mult(num);
        System.out.println(factorial);
        System.out.println(zerocount(factorial,0));
    }
}
