package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task7
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int ind = s1.indexOf(s2);

        if (ind==-1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
