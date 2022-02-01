package ClientsFinal;


public class Main {

    public static void main(String[] args)
    {
        String []s = {"asfasfasf", "DSfasfasfa", "Peps", "dasfasfa", "safewtet", "wqr"};

        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i].charAt(s[i].length()-1)+" ");
        }
    }
}
