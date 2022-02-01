package BitlabAcademy.Arrays.hometask;

import java.util.Scanner;

public class task14
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int index = 0;
        boolean doesExist = false;

        for(int i=0; i<n; i++){
            if(arr[i]==m)
            {
                System.out.println("YES");
                System.out.println(i);
                doesExist = true;
                break;
            }else
                doesExist = false;
        }

        if(doesExist == false)
            System.out.println("NO");

    }
}