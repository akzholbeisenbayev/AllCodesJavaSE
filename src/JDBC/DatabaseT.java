package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseT
{
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/databaseT?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";

    //jdbc:mysql://localhost:3306
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");

            while(true)
            {
                System.out.println("PRESS [1] to Add users to DB");
                System.out.println("PRESS [2] to Show users from DB");
                System.out.println("PRESS [3] to Delete users from DB");
                System.out.println("PRESS [4] to Edit users in DB");
                System.out.println("PRESS [5] to Exit");

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int choice = Integer.parseInt(reader.readLine());
                if(choice == 5) break;
                if(choice == 1)
                {
                    System.out.print("Insert name: ");
                    String name = reader.readLine();
                    System.out.print("Insert surname: ");
                    String surname = reader.readLine();
                    addUser(new User(null, name, surname));
                }
                else if(choice == 2)
                {
                    ArrayList<User> users1 = getUsers();
                    for(User u: users1)
                    {
                        System.out.println(u.toString());
                    }
                } else if(choice == 3)
                {
                    System.out.print("Insert index of user, which you want to delete: ");
                    int index = Integer.parseInt(reader.readLine());
                    deleteUsers(index);

                }else if(choice == 4)
                {
                    System.out.print("Insert index of user, which you want to edit: ");
                    int index = Integer.parseInt(reader.readLine());
                    System.out.print("Insert name, to what you want to change: ");
                    String name = reader.readLine();
                    System.out.print("Insert surname, to what you want to change: ");
                    String surname = reader.readLine();
                    editUsers(index, name, surname);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void addUser(User u)
    {

        try {
            String query = "insert into users(name, surname) values(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, u.getName());
            preparedStatement.setString(2, u.getSurname());
            preparedStatement.executeUpdate();
            System.out.println("Inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<User> getUsers()
    {
        ArrayList<User> users = new ArrayList<>();

        try
        {
            Statement statement = connection.createStatement();

            String query = "select *from users";
            ResultSet resultSet = statement.executeQuery(query);

            {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");

                users.add(new User(id,name,surname));
            }
            statement.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return users;
    }

    private static void deleteUsers(int index)
    {

        try
        {
            Statement statement = connection.createStatement();
            String query = "delete from users where id = " +index;
            statement.executeUpdate(query);
            System.out.println("User has successfully deleted from DB!");
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void editUsers(int index, String name, String surname)
    {
        try
        {
            String query = "update users set name=?, surname=? where id = " + index;
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.executeUpdate();
            System.out.println("Updated!");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
