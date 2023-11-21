import java.util.Arrays;

public class merge_sort { // of 2 sorted array // using
    public static void main(String[] args) {
        int[] n =  {2, 3, 6, 12, 26,102,105,114,125};
        int[] m = {1,5,10,11,23,32,45};

        int a = 0; // related to m
        int b = 0; // related to n
        int[] arr = new int[m.length+n.length];
        for (int i = 0; i < arr.length; i++) { // i is related to arr
            if (a < m.length && b<n.length){
                if (m[a] < n[b]) {
                    arr[i] = m[a];
                    a++;
                } else {
                    arr[i] = n[b];
                    b++;
                }
            }else if(a == m.length && b < n.length){
                arr[i] = n[b];
                b++;
            } else{
                arr[i] = m[a];
                a++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
