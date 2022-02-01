package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;
import java.util.StringTokenizer;

public class task15
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        StringTokenizer st = new StringTokenizer(s1," ");

        while (st.hasMoreTokens()){
            String s2 = st.nextToken();
            String n = new String();
            for(int i=s2.length()-1; i>-1; i--){
                n += s2.charAt(i);
            }
            System.out.print(n+" ");
        }
    }
}
