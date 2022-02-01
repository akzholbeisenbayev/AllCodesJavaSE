package BitlabAcademy.String;

import java.util.Scanner;

public class Task19
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int n = text.length();
        int  k = 0;
        for (int i = 0; i < n; ++i)
        {
            if (text.charAt(i) != text.charAt(n - i - 1))
            {
                k=1;
            }
            else k = 0;
        }
        if(k==1)
            System.out.println("NO");
        else System.out.println("YES");
    }
}
