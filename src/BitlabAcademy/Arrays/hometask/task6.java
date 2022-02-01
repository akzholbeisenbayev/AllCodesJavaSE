package BitlabAcademy.Arrays.hometask;

import java.util.Scanner;

public class task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum = 0; //55

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.println(sum + " " + (sum*1.0)/n);
        //55.0  / 10 = 5.5
    }
}
