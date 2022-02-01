package BitlabAcademy.TwoDimensionalArrays.newprog.hometask;

import java.util.Scanner;

public class task9
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();
    int[][] mas = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            mas[i][j] = in.nextInt();
        }
    }

    for (int i = 0; i < n; i++) {
        int max = -1000;
        for (int j = m - 1; j >= 0; j--) {
            if(mas[i][j] > max)
                max = mas[i][j];
        }
        System.out.println(max);
    }

}
}
