package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int [][] array = new int[N][M];
        int max= Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            for(int j=0; j<M;j++)
            {
                array[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<N;i++)
        {
            for(int j=0; j<M;j++)
            {
                if(array[i][j]>max && array[i][j]!=0)
                {
                    max=array[i][j];

                }
            }System.out.println(max);
        }
    }
}
