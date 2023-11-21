import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {23,45,69,85,102,401};

        System.out.println("Enter the integer to be searched: ");
        int key = in.nextInt();

        int indexR = binarysearch(arr, 0,arr.length-1,key);
        if (indexR != -1)
            System.out.println("The element " + key + " is found at "+ indexR + " index of the given array.");
        else
            System.out.println("The element " + key + " is not found.");

    }


    // recursive method
    private static int binarysearch(int[] arr, int start, int end, int key) {
        int mid = start + (end-start)/2;
        if(start<=end)
            if(key<arr[mid])
                return binarysearch(arr, start,mid-1,key);
            else if (key>arr[mid])
                return binarysearch(arr,mid+1,end,key);
            else
                return mid;
        else return -1;
    }
}
