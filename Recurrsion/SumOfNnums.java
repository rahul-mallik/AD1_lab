//Find the sum of n nums using recursion


package Recurrsion;
import java.util.Scanner;

public class SumOfNnums {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the integer value of n: ");
        int n = in.nextInt();
        System.out.println("Sum of n numbers : "+sumOfnNum(n,0));
    }

    static int sumOfnNum(int n,int sum){
        if(n==0)
            return sum;
        else
            return sumOfnNum(n-1,sum+n);
    }
}
