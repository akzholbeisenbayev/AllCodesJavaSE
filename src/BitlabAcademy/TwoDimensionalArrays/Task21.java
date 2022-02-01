package BitlabAcademy.TwoDimensionalArrays;
//
//import java.util.Scanner;
//public class Task21
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int M = in.nextInt();
//        int [][] array = new int[N][M];
//        double sum=0;
//        double orta;
//        int count =0;
//
//        for(int i=0;i<N;i++)
//        {
//            for(int j=0; j<M;j++)
//            {
//                array[i][j] = in.nextInt();
//            }
//        }
//        System.out.println();
//        for(int i=0;i<N;i++)
//        {
//            for (int j = 0; j < M; j++)
//            {
//                count++;
//                sum+=array[i][j];
//            }
//        }
//        orta = sum/count;
//
//        for(int i=0;i<N;i++)
//        {
//            for (int j = 0; j < M; j++)
//            {
//                if(array[i][j]<orta)
//                {
//                    array[i][j] = 0;
//                }
//            }
//        }
//        for(int i=0;i<N;i++)
//        {
//            for (int j = 0; j < M; j++)
//            {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int count = 0;
        int avg = 0;
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum+=nums[i][j];
                count++;
            }
        }
        avg = sum/count;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] < avg) {
                    nums[i][j] = 0;
                }
            }
        }for (int i = 0; i < n; i++) {avg=0;
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            } System.out.println();
        }
    }
}