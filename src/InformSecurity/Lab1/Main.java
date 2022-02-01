package InformSecurity.Lab1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //7.	ХЕРЕС ПОПАЛ НА ПЕРЕВЯЗЬ	(k=3)

        String text = "heres popal na perevyaz";
        //104 101
        //kh

        //97-122

        int k = 3;

        StringBuffer newText = new StringBuffer("");

        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)==' ')
            {
                newText.append(' ');
            }
            else if((char)text.charAt(i)>119){
                newText.append((char)(97+(2-(122-(char)text.charAt(i)))));
            }
            else{
                    int b = text.charAt(i) + 3;
                    char a = (char) b;
                    newText.append(a);
                }
            }

        System.out.println(newText);
    }
}
