package TWODarray;

import java.util.*;

public class key {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m = 3;
        int n = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        search(matrix, 5);
    }

    public static void search(int matrix[][], int key) {
        int m = 3;
        int n = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at :" + i + "," + j);
                }
            }

        }

    }
}
