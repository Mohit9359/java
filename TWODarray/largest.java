package TWODarray;

import java.util.*;

@SuppressWarnings("resource")
public class largest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int m = 3;
        int n = 3;
        int nums[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];

                }
            }
        }
        System.out.println(max);

    }
}
