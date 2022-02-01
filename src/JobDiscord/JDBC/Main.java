package JobDiscord.JDBC;

//deposit of money
//withdrawal of money
//money transfer

//by credit Card
//PayPal
//other

import JDBC.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

public class Main
{
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/PaymentManagement?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";
    private static Object PaymentReal;


    public static void main(String[] args)
    {

//	System should be able to add users accounts (they should be unique); 7%
//	System should be able to log of all operations/transactions taken on accounts; 7%
//	All transactions must be written on an external txt file immediately; 7%
//	Transactions must be sorted by Date (create your custom comparator and use it); 10%
//	System should be able to show transactions of certain user; 5%
//	System should be able to print statement upon each payment via external source; 7%
//	Transactions should be checked for validity before they take place; 7%
//	System should be able to retrieve list of users; 5%
//	Additional: system may have an opportunity to print detailed information about each user; 5%
//	All functional requirements should be implemented in PaymentManagement.java file

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("We have successfully connected");
//deposit of money / withdrawal of money / money transfer
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
                    System.out.print("Insert id: ");
                    int id = Integer.parseInt(reader.readLine());
                    System.out.print("Insert name: ");
                    String name = reader.readLine();

                    System.out.print("Insert surname: ");
                    String surname = reader.readLine();
                    System.out.print("Insert balance: ");
                    double balance = Double.parseDouble(reader.readLine());
                    PaymentReal paymentType = new PaymentReal("PayPal");
                    paymentType.setType("PayPal");
                    addUser(new UserAccount(id, name, surname,balance, paymentType));
                }
                
                else if(choice == 2)
                {
                    ArrayList<UserAccount> users1 = getUsers();
                    for(UserAccount u: users1)
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
                    System.out.print("Insert id, to what you want to change: ");
                    int id = Integer.parseInt(reader.readLine());
                    System.out.print("Insert name, to what you want to change: ");
                    String name = reader.readLine();
                    System.out.print("Insert surname, to what you want to change: ");
                    String surname = reader.readLine();
                    System.out.print("Insert balance, to what you want to change: ");
                    double balance = reader.read();
                    System.out.print("Insert paymentType, to what you want to change: ");
                    String paymentType = reader.readLine();
                    PaymentReal paymentType2 = new PaymentReal(paymentType);
                    editUsers(index, id, name, surname, balance, paymentType2);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void addUser(UserAccount u)
    {

        try {
            String query = "insert into UsersAccount(id, name, surname, balance, paymentType) values(?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, u.getId());
            preparedStatement.setString(2, u.getName());
            preparedStatement.setString(3, u.getSurname());
            preparedStatement.setDouble(4, u.getBalance());
            String text = String.valueOf(u.getPaymentType());
            preparedStatement.setString(5, text);
          
            
            preparedStatement.executeUpdate();
            System.out.println("Inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<UserAccount> getUsers()
    {
        ArrayList<UserAccount> users = new ArrayList<>();

        try
        {
            Statement statement = connection.createStatement();

            String query = "select *from UsersAccount";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                double balance = resultSet.getDouble("balance");
                String paymentType = resultSet.getString("paymentType");
                PaymentReal paymentType2 = new PaymentReal(paymentType);
                users.add(new UserAccount(id,name,surname,balance,paymentType2));
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
            String query = "delete from UserAccount where id = " +index;
            statement.executeUpdate(query);
            System.out.println("User has successfully deleted from DB!");
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void editUsers(int index,int id, String name, String surname, Double balance, PaymentReal paymentType2)
    {
        try
        {
            String query = "update UserAccount set id=?, name=?, surname=?, balance=?, paymentType=? where id = " + index;
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setDouble(4, balance);
            String paymentType = paymentType2.getType();
            preparedStatement.setString(5, paymentType);
            preparedStatement.executeUpdate();
            System.out.println("Updated!");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
