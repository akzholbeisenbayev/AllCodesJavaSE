package BitlabAcademy.TwoDimensionalArrays.newprog.hometask;

import java.util.Scanner;

public class task5
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

        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if((i % 2 == 0) && j % 2 == 0){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
