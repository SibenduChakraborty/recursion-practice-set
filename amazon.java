package com.recursiontut;

public class amazon {
    public static void main(String[] args) {
        int[] arr = {117, 118, 119, 2022, 2025, 5000, 5001, 5002, 5003, 5505, 5555, 6666, 7777, 9999,51007};
        System.out.println( findrange(arr, 51007));
    }
    static int findrange(int[] arr, int target){
        int start = 0;
        int end =1;
        // to search if the target is actually in the upcoming chunk
        while(target > arr[end]){
            int temp= end+1;//this is new start
            end= (end -start + 1) *2 + end;
            start = temp;
        }
        return binary(arr, target, start, end);
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
