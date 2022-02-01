package BitlabAcademy.Loops;

import java.util.Scanner;

public class Task24
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();

        double multiplication = 1;

        for (int i=1; i<=n; i++)
        {
            multiplication *= i;
        }
        System.out.println(multiplication);
    }
}