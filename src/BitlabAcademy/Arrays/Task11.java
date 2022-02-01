package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        double array[] = new double[n];
        for(int i=0;i<array.length;i++)
        {
            array[i] = in.nextInt();
        }
        double sum = 0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        double p = sum/n;
        System.out.print(sum + " " + p);
    }
}
