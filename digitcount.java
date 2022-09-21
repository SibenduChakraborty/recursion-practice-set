package com.recursiontut;

public class digitcount {
    static int solver(int res, int count){
        if(res/10<=1){
            return count;
        }
        count++;
        res= res/10;
        return solver(res,count);

    }
    public static void main(String[] args) {
        int a= 5487;
        int i = (solver(a, 0)) + 1;
        System.out.println(i);
    }
}
