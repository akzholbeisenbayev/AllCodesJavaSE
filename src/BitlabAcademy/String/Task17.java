package BitlabAcademy.String;

import java.util.Scanner;

public class Task17
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char[] array = text.toCharArray();
        String text2 = in.next();
        char[] array2 = text2.toCharArray();
        int temp=0;

        if(text.length() == text2.length())
        {
            for(int i=array.length-1;i>=0;i--)
            {
                if(array[i] == array2[i])
                {
                    temp=1;
                }
            }
        }
        else System.out.println("No");
        if(temp == 1)
            System.out.println("Yes");


        //for(int i =0;i<text.length();i++)
        // {
        //            if(text.charAt(sum--)==text1.charAt(i))
        //            {
        //                isTrue=true;
        //            }else isTrue=false;break;
        //        }
        //        if(isTrue)
        //        {
        //            System.out.println("YES");
        //            }
        //        else
        //        {
        //            System.out.println("NO");
        //         }
    }
}














