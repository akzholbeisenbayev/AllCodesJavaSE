package BitlabAcademy.Loops;

import java.util.Scanner;

public class Task27
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double n= in.nextDouble();
        double sum=0;

        for(double i=1; i<=n; i++)
        {
            sum=sum+1/i;
        }
        System.out.println(sum);
    }
}
