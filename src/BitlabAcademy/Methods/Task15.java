package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][]arr = new int[a][a];

        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        tri(arr,a);
    }

    public static void tri(int[][] arr, int n){
        int temp;
        for (int i = 0; i < 1; i++) { //i = 0
            for (int j = 0; j < n; j++) { // j =1 -> arr[i][j] = 3
                temp = arr[i][j]; //temp = 3
                arr[i][j] = arr[n-i-1][j]; //arr[i][j] = 6
                arr[n-i-1][j] = temp; // //arr[i][j] = 2
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}