package com.recursion;

import java.util.Arrays;

public class bubblesort {
    static int[] bubblesort(int[] arr){
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr= {2,6,5,4,7,8};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
