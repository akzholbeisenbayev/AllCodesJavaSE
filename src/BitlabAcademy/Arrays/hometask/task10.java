package BitlabAcademy.Arrays.hometask;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

     //   int min = Integer.MAX_VALUE; //2 147 483 647
        int min = arr[0]; //6
        //10
        //6 19 26 3 46 8 5 65 90 25
        for(int i=1; i<n; i++){
            if(arr[i]<min) //3
            {
                min = arr[i]; //3
            }
        }

        System.out.println(min*min);

    }
}
