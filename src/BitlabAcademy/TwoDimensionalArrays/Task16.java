package BitlabAcademy.TwoDimensionalArrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int temp = 0;
//        int[][] nums = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                nums[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m/2; j++) {
//                temp=nums[i][j];
//                nums[i][j]= nums[i][m-j-1];
//                nums[i][m-j-1] = temp;
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
        for(int i = 0;i<N;i++){
            for(int j = M-1;j>=0;j--){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}