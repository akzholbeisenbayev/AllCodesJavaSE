package BitlabAcademy.TwoDimensionalArrays.newprog.practice;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[][] arr = new int[a][a];

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < a; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        int[][] arr1 = new int[a][a];

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < a; j++)
            {
                if(i == 0 || i == a -1)
                {
                    arr1[i][j] = arr[a-1-i][j];
                }
                else
                {
                    arr1[i][j] = arr[i][j];
                }
            }
        }
        System.out.println();

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < a; j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int[][] mas = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                mas[i][j] = in.nextInt();
//            }
//        }
//
//        for(int j = 0; j < n; j++){
//            System.out.print(mas[n - 1][j] + " ");
//        }
//
//        System.out.println();
//
//        for(int i = 1; i < n - 1; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(mas[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < n; i++){
//            System.out.print(mas[0][i] + " ");
//        }
//    }
}
