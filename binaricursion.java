package com.recursiontut;

public class binaricursion {
    public static void main(String[] args) {
        int[] arr = {117, 118, 119, 2022, 2025, 5000, 5001, 5002, 5003, 5505, 5555, 6666, 7777, 8888, 51007};
        System.out.println( binary(arr, 51007, 0, arr.length-1));
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
//}
