package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task24
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++)
        {
            array[i] = in.nextInt();
        }

        int m = in.nextInt(), index = 0;
        boolean isTrue = false;

        for(int i=0;i<array.length;i++)
        {
            if(array[i] == m)
            {
                isTrue = true;
                index = i;
                break;
            }
        }

        if(isTrue)
        {
            System.out.println("YES");
            System.out.println(index);
        }
        else
            System.out.println("NO");

        }
}
