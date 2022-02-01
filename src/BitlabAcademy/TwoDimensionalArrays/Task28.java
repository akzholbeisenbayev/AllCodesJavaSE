package BitlabAcademy.TwoDimensionalArrays;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int temp=0;
        for(int i=0; i< arr.length; i++){
            temp=arr[i][arr[i].length-1-i];
            arr[i][arr[i].length-1-i]=arr[i][i];
            arr[i][i]=temp;
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


    }
}
