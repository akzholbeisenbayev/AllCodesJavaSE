package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class Task29
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int temp = 0, count = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp+=arr[i][j];
                if(arr[i][j] == 0){
                    System.out.println("n");
                    break;
                }
                count++;
            }
            if(count == m){
                System.out.println(temp);
            }
            count = 0;
            temp = 0;
        }
    }
}

