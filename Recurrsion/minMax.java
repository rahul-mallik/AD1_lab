//Find the min and max value from an array using recursion


package Recurrsion;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array(integer): ");
        int size = in.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the integer values for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        int [] sol = maxMinvalue(arr, 0,arr[0],0);
        System.out.println("max value: "+sol[1]);
        System.out.println("min value: "+sol[0]);

    }

    static int[] maxMinvalue(int[]arr, int i, int min, int max){
        if(i == arr.length) {
            return new int[]{min, max};
        }else{
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
            return maxMinvalue(arr, ++i,min,max);
        }
    }

}
