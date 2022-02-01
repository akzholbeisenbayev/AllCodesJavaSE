package BitlabAcademy.IfELse;

import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();

        if(month>12)
            year+=1;

        if(year<2000)
        {
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
