package BitlabAcademy.Files.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("PRESS [1] TO ADD USERS\n" +
                    "\n" +
                    "        PRESS [2] TO LIST USERS\n" +
                    "\n" +
                    "        PRESS [3] TO DELETE USERS\n" +
                    "\n" +
                    "        PRESS [4] TO EXIT");

            int select = scanner.nextInt();
            if (select == 1) {
                System.out.println("Insert id: ");
                int id = scanner.nextInt();

                System.out.println("Insert login: ");
                String login = scanner.next();

                System.out.println("Insert password: ");
                String password = scanner.next();

                User user = new User(id, login, password);
                users = getUsersList();
                users.add(user);
                saveUsersList(users);
            } else if (select == 2) {
                users = getUsersList();
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + ") " + users.get(i).toString());
                }
            } else if (select == 3) {
                users = getUsersList();
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + ") " + users.get(i).toString());
                }
                System.out.println("Insert index to delete: ");
                int index = scanner.nextInt();
                users.remove(index - 1);
                saveUsersList(users);
            } else if (select == 4) {
                System.exit(0);
            } else {
                System.out.println("error");
            }
        }
    }
    private static void saveUsersList (ArrayList <User> users) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("memory.txt"));

            for (User g : users) { // u = users.get(i)
                bufferedWriter.write(g.getId() + "\n");
                bufferedWriter.write(g.getLogin() + "\n");
                bufferedWriter.write(g.getPassword() + "\n");

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<User> getUsersList () {
        ArrayList<User> users = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("memory.txt"));
            String line = ""; //line = "1"
            while ((line = bufferedReader.readLine()) != null) {
                int a = Integer.parseInt(line); //1
                String log = bufferedReader.readLine(); //"ыфаа"
                String passw = bufferedReader.readLine(); //"sfd"
                users.add(new User(a, log, passw));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

}
