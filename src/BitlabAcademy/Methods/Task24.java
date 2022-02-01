package BitlabAcademy.Methods;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = in.nextInt();

            }
        }test(N, M, array);
    }

    public static void test(int n, int m, int[][] arr) {
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}