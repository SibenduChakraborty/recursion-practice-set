package com.recursiontut;

public class loopsum {
    static void checkarray(int[] arr1,int i) {
        int start= arr1[i];
        for(int n=i+1; n<= arr1.length; n++){
            if(arr1[n]>start){
                int temp= arr1[n];
                arr1[n]=start;
                start=temp;
            }
        }
        checkarray(arr1, i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,4,8,5,6,1};

    }
}

