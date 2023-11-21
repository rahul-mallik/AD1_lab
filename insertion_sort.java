import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr= {12,-4,45,89,47,4,12,-85,-1,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
}

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if (arr[j-1]>arr[j]) {
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}

