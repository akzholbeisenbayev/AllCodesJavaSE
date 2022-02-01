package BitlabAcademy.Arrays.hometask;

import java.util.Scanner;

public class task11
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
        int index = 0;

        //-4 9 2 16 -5 8 7 -11
        for(int i=0; i<n; i++){
            if(arr[i]>max)
            {
                max = arr[i]; //16
                index = i; //3
            }
        }

        System.out.println(max + " " + index);

    }
}
