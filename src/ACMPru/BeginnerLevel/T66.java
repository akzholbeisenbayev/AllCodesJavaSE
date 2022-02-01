package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T66
{
    public static void main(String[] args)
    {
        char[] c = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd',
                'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        Scanner cin = new Scanner(System.in);
        char s = cin.next(".").charAt(0);

        for(int i=0; i<c.length; i++)
        {
            if(s=='m')
            {
                System.out.println('q');
                break;
            }
            else {
                if (c[i] == s)
                {
                    System.out.println(c[i + 1]);
                    break;
                }
            }
        }
    }
}