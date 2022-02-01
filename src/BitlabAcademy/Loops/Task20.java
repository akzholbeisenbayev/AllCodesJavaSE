package BitlabAcademy.Loops;

import java.util.Scanner;

public class Task20
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=5;
        int count=0;

        while(n!=0)
        {
            n = in.nextInt();
            count++;
        }
        System.out.println(count-1);
    }
}
