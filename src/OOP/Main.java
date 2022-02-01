package OOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = 10;
        int m = 7;


        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = cin.nextInt();
            }
        }

        for(int i = 0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m - 1; k++) {
                    if (a[i][k] > a[i][k+1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}





