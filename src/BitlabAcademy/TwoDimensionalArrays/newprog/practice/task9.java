package BitlabAcademy.TwoDimensionalArrays.newprog.practice;

import java.util.Scanner;

public class task9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = m - 1; j >= 0; j--) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println(max);
        }

    }
}
