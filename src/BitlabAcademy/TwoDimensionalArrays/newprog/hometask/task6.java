package BitlabAcademy.TwoDimensionalArrays.newprog.hometask;

import java.util.Scanner;

public class task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int max_ind1 = 0, max_ind2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    max_ind1 = i;
                    max_ind2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(max_ind1 + " " + max_ind2);
    }
}
