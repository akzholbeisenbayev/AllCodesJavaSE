package BitlabAcademy.TwoDimensionalArrays.newprog.practice;

import java.util.Scanner;

public class task2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[2][n];
        for(int j = 0; j < 2; j++)
        {
            for(int i = 0; i < n; i++)
            {
                arr[j][i] = in.nextInt();

            }
        }

        for(int i = 0; i < 2; i++) //1<2
        {
            // n = 3
            for(int j = 0; j < n; j++) //  3<3
            {
                System.out.print(arr[i][j] + " "); //1 2 3
                                                    //4 5 6
            }
            System.out.println();
        }
    }
}
