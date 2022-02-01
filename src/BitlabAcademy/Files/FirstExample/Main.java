package BitlabAcademy.Files.FirstExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        try{
            BufferedReader reader = new BufferedReader (new FileReader("file.txt"));
            String s;
            while((s=reader.readLine())!=null)
            {
                if(s.equals("Hello BITLAB"))
                     System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }


        //try{
//            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//            int symbol;
//            while((symbol=br.read())!=-1)
//            {
//                System.out.println((char)symbol); //int
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        }
}
