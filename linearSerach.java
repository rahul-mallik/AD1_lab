import java.util.Scanner;

public class linearSerach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {69, 74, 77, 24, 48, 51, 23};

        System.out.println("Enter the integer to be searched: ");
        int x = in.nextInt();
        int index = -1;
        //linear search non-recursive method
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(x + " found in the array at index " + (index = i));
                break;
            }
        }
        if(index==-1)
            System.out.println("Element not found");



        System.out.println("Enter the integer to be searched: ");
        int key = in.nextInt();

        //recursion
        int indexR = linearsearch(arr, arr.length-1, key);
        if (indexR != -1)
            System.out.println("The element " + key + " is found at "+ indexR + " index of the given array.");
        else
            System.out.println("The element " + key + " is not found.");
    }

    // recursive method
    static int linearsearch(int[] arr, int size, int key) {
        if (size == -1) {
            return -1;
        }
        else if (arr[size] == key) {
            return size;
        }
        return linearsearch(arr, size - 1, key);
    }

}
