package BitlabAcademy.TwoDimensionalArrays;
//import java.util.Scanner;
//
//public class Task19 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }for(int j=0; j<arr[0].length; j++){
//            int max=0;
//            for(int i=0; i<n; i++){
//                if(arr[i][j]>max){
//                    max=arr[i][j];
//                }
//            }System.out.print(max+" ");
//        }
//        System.out.println();
//    }
//}


import java.util.Scanner;
public class Task19
{
    public static void main(String[] args)
    {
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

        for(int j=0; j<M;j++)
        {
            for(int i=0;i<N;i++)
            {
                if(array[i][j]>max)
                {
                    max=array[i][j];

                }
            }System.out.println(max);
        }
    }
}