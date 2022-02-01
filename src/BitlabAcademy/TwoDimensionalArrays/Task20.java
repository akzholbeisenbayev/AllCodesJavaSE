package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class Task20
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [][] array = new int[N][N];
        int max= Integer.MIN_VALUE;

        for(int i=0;i<N;i++)
        {
            for(int j=0; j<N;j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                array[0][j] = array[N - 1][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}