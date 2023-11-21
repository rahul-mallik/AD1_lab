import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr= {12,-4,45,89,47,4,12,-85,-1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue=arr[i], minIndex =i;
            for (int j = i; j < arr.length; j++) {
                if (minValue>arr[j]) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = temp;
        }
    }
}
