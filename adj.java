import java.util.Arrays;
import java.util.Scanner;

public class adj {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of vertex: ");
        int vertex = in.nextInt();
        System.out.println("Enter the no. of edges: ");
        int edges = in.nextInt();
        System.out.println("Enter the start and the end point of the edges(with a space): ");
        int[][] adjMatrix = new int[vertex][vertex];
        for (int i = 0; i < edges; i++) {
            int f = in.nextInt();
            int l = in.nextInt();
            adjMatrix[f-1][l-1] = 1;
            adjMatrix[l-1][f-1] = 1;
        }


        for (int i = 0; i < vertex; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));}

    }
}
