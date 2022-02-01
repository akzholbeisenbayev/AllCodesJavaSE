package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int temp = 0;
//
//        int[][] nums = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                nums[i][j] = in.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n/2; i++) {
//            for (int j = 0; j < m; j++) {
//                temp=nums[i][j];
//                nums[i][j]= nums[n-1-i][j];
//                nums[n-i-1][j] = temp;
//            }
//        }for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][]array = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = N-1;i>=0;i--){
            for(int j = 0;j<M;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}