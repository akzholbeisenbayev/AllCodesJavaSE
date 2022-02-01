package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class Task30
{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        int[][] arr = new int[n][m];





        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++){
            System.out.print("-" +" ");
        }

        System.out.println();

        int[][]arr2 = new int[k][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[j][i] < 0){
                    arr2[count][i] = arr[j][i];
                    count++;
                    if(count == k){
                        break;
                    }
                }
            }
            count = 0;
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                if(arr2[i][j] == 0){
                    System.out.print("X" + " ");
                } else {
                    System.out.print(arr2[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
