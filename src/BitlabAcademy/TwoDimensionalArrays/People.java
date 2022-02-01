package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class People
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] array = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};


        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                array[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        array[1][2] = 5;

        System.out.println(array[0][0]);
    }
}
