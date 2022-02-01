package BitlabAcademy.Files.task1Dauren;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        do
        {
            System.out.println("PRESS [1] TO ADD USERS\n" +
                    "        PRESS [2] TO LIST USERS\n" +
                    "        PRESS [3] TO DELETE USERS\n" +
                    "        PRESS [4] TO EXIT");
            a = in.nextInt();
            if (a == 1)
            {
                System.out.print("enter id: ");
                int id = in.nextInt();
                System.out.print("enter login: ");
                String login = in.next();
                System.out.print("enter password: ");
                String password = in.next();
                User zhopa = new User(id, login, password);
                ArrayList<User> users = getUsersList();
                users.add(zhopa);
                saveUsersList(users);
            }
            if (a == 2)
            {
                ArrayList<User> users = getUsersList();
                for (int i = 0; i < users.size(); i ++)
                {
                    System.out.println((i+1) + ") "+ users.get(i));
                }
            }
            if (a == 3)
            {
                ArrayList<User> users = getUsersList();
                for (int i = 0; i < users.size(); i++)
                {
                    System.out.println((i + 1) + ") " + users.get(i));
                }

                System.out.println("Insert index of user to delete: ");
                int index = in.nextInt();
                users.remove(index-1);
                saveUsersList(users);
            }
        }
        while(a != 4);
    }

    static ArrayList<User> getUsersList()
    {
        ArrayList<User> a = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String line = "";
            while ((line = br.readLine()) != null)
            {
                int id = Integer.parseInt(line);
                String login = br.readLine();
                String password = br.readLine();
                a.add(new User(id, login, password));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;
    }
    static void saveUsersList (ArrayList<User> users)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
            for(User popa : users)
            {
                bw.write(popa.getId() + '\n');
                bw.write(popa.getLogin() + '\n');
                bw.write(popa.getPassword() + '\n');
            }
            bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
