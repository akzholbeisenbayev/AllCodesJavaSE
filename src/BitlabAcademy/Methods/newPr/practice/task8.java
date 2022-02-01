package BitlabAcademy.Methods.newPr.practice;

import java.util.Scanner;
public class task8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        task8newArr(array);

    }

    public static void task8newArr(int[][] array)
    {
        for(int j = 0; j < array.length; j++)
            System.out.print(array[array.length-1][j]+" ");

        System.out.println();

        for(int i = 1; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }

        for(int i = 0; i < array.length; i++ )
            System.out.print(array[0][i]+" ");
        System.out.println();


    }
}