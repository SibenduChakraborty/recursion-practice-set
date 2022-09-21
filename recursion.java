package com.recursion;

import java.util.Scanner;

public class recursion {

    static int binary(int[] arr, int s, int e, int target){
        int mid= s+(e-s)/2;
        if(s>e){
            return -1;
        }
        else if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return binary(arr,mid+1,e,target);
        }

        return binary(arr,s,mid-1,target);

    }

    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int a=binary(arr,0,arr.length-1,4);
//        System.out.println(a);
          Scanner sc= new Scanner(System.in);
//        int i= sc.nextInt();
        String s=sc.nextLine();
        String ss= sc.nextLine();
        if(s.charAt(0)==ss.charAt(0)){
            System.out.println("thikache");
        }

    }
//    static int recursion1(int n){
//        if(n<2){
//            return (n);
//        }
//        return (recursion1(n-1) + recursion1(n-2));
//    }
}
