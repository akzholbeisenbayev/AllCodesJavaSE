package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T416
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char character = in.next().charAt(0);
        int a = in.nextInt();


        if((a+2<=8) && a+2>=1 && (int)character+1<=104 && (int)character-1>=97)
          //  System.out.println(Character.toChars(((a+2));


        if((a+1<=8) && a+1>=1 && (int)character+2<=104 && (int)character+2>=97)
            System.out.println((char)((int)character+2) + (a+1));

        if((a+2<=8) && a+2>=1 && (int)character-1<=104 && (int)character-1>=97)
            System.out.println((char)((int)character-1) + (a+2));

        if((a+1<=8) && a+1>=1 && (int)character-2<=104 && (int)character-2>=97)
            System.out.println((char)((int)character-2) + (a+1));

        if((a-1<=8) && a>=1 && (int)character+2<=104 && (int)character+2>=97)
            System.out.println((char)((int)character+2) + (a-1));

        if((a-1<=8) && a>=1 && (int)character-2<=104 && (int)character-2>=97)
            System.out.println((char)((int)character-2) + (a-1));

        if((a-2<=8) && a>=1 && (int)character+1<=104 && (int)character>=97)
            System.out.println((char)((int)character+1) + (a-2));


    }
}
