package BitlabAcademy.TwoDimensionalArrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] maxS = new int [n];
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {max=0;
            for (int j = 0; j < m; j++) {
                if (nums[i][j] > max) {
                    max=nums[i][j];
                }
            }maxS[i]=max;
        }for (int i= 0; i<n;i++) {
            if (maxS[i] < min) {
                min = maxS[i];
            }
        }
        System.out.println(min);
    }
}