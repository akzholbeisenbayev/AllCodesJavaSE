package BitlabAcademy.Arrays.hometask;

import java.util.Scanner;

public class task15
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int temp = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            if(arr[i]>m)
            {
                sum+=arr[i]; //
                temp++; //
            }
        }
        System.out.println(sum*1.0/temp);

    }
}
