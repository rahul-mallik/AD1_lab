//Find the nth element of the fibonacci series using recursion


package Recurrsion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer value to get the nth element of fibonacci series:  ");
        int n= in.nextInt();
        System.out.println("nth element of the fibonacci series: "+series(n-2,0,1));
    }

    static int series(int n,int a,int b){
        if(n<=0)
            return b;
        else
            return series(--n,b,a+b);
    }
}
