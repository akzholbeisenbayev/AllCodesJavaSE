package BitlabAcademy.Arrays.practice;

import java.util.Scanner;

public class task9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE; //-2 147 483 648 to 2 147 483 647

        for(int i=0; i<n; i++){
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
