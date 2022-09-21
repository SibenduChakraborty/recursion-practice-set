package com.recursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println( binary(arr, 4, 0, arr.length-1));
    }
    static int binary(int[] arr, int target, int start, int end){
        if(start > end){//not found the answer
            return -1;
        }
        int m= start + (end-start)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return binary(arr,target,start,m-1);
        }
        return binary(arr, target, m+1, end);
    }
}
//
