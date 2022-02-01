package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class Task11
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int [][] array = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0; j<M;j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=0;
            for(int j=0; j<M; j++)
            {
                sum+= array[i][j];
            }
            System.out.println(sum);
        }

    }
}
