package OOP.Interface;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Akzhol Beisenbayev ITSE-1904
//task1

//Task Create "data .txt" in which we will store login and
//password values. We need to check the username and password
//values for the user. 30%

public class Main
{
    public static void main(String[] args)
    {
     Scanner cin = new Scanner(System.in);
             File file = new File("data.txt");

            System.out.print("Insert login: ");
            String login = cin.next();
            System.out.print("Insert password: ");
            String password = cin.next();

            try( BufferedReader reader = new BufferedReader(new FileReader(file)))
            {
                String y;
                ArrayList<String> data = new ArrayList<>();
                while((y=reader.readLine())!=null)
                {
                    data.add(y);
                }
                if(data.get(0).equals(login) && data.get(1).equals(password))
                {
                    System.out.println("Login and password are correct");
                } else System.out.println("Login and password are NOT correct");
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
    }
}


