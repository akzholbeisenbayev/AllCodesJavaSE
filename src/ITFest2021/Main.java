package ITFest2021;

import java.io.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private  static File file = new File("data.txt");
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/ITFest?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";

    //jdbc:mysql://localhost:3306
    public static void main(String[] args)
    {
        Request request = new Request("124125355", "Beisenbayev", "Nurlanovich",
                "+77027879977", "5-i mkr, 23", 18, "none",
                0, "no", "flat", "Java developer",
                "stipuha", "none", "no", "no",
                "Arman", "Arman", "Arman", "+77777777777");

        Request request1 = new Request("asffasfsa", "Beisenbayev", "Nurlanovich",
                "+77027879977", "5-i mkr, 23", 18, "none",
                0, "no", "flat", "Java developer",
                "stipuha", "none", "no", "no",
                "Arman", "Arman", "Arman", "+77777777777");

        Request request2 = new Request("TTTTTTTT", "Beisenbayev", "Nurlanovich",
                "+77027879977", "5-i mkr, 23", 18, "none",
                0, "no", "flat", "Java developer",
                "stipuha", "none", "no", "no",
                "Arman", "Arman", "Arman", "+77777777777");

        List<Request> list = new ArrayList<>();
        list.add(request);
        list.add(request1);
        list.add(request2);
        dataFromAnketa(list);
        dataToOutput();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");

            addUser(request);
            deleteUsers("+77027879977");
        }catch (ClassNotFoundException | SQLException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }


    public static void dataFromAnketa(List<Request> request)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oos.writeObject(request);
            System.out.println("File has been written");
            oos.flush();
        }catch (FileNotFoundException e)
        {
            System.out.println("File not founded");
        }catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Invalid input/output data");
        }
    }


    public static void dataToOutput()
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            List<Request> temp;
            while(true)
            {
                temp = (List<Request>) ois.readObject();
                if (temp == null) break;
                for (Request request: temp){
                    System.out.println(request);
                }

            }
        }catch (FileNotFoundException e)
        {
            System.out.println("File not founded");
        }catch (IOException e)
        {
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("class not founded");
        }
    }


    private static void addUser(Request request)
    {
        try {
            String query = "insert into Request(name, surname, middlename, phoneNumber, address, age,maritalStatus,countOfChildren, maintenancePerson, houseType,  employmentType, governmentsHelp,whyNotHaveHelp, familyProblems, reEducating, VolunteerName,VolunteerSurname,VolunteerMiddlename,  VolunteersPhoneNumber ) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, request.getName());
            preparedStatement.setString(2, request.getSurname());
            preparedStatement.setString(3, request.getMiddlename());
            preparedStatement.setString(4, request.getPhoneNumber());
            preparedStatement.setString(5, request.getAddress());
            preparedStatement.setInt(6, request.getAge());
            preparedStatement.setString(7, request.getMaritalStatus());
            preparedStatement.setInt(8, request.getCountOfChildren());
            preparedStatement.setString(9, request.getMaintenancePerson());
            preparedStatement.setString(10, request.getHouseType());
            preparedStatement.setString(11, request.getEmploymentType());
            preparedStatement.setString(12, request.getGovernmentsHelp());
            preparedStatement.setString(13, request.getWhyNotHaveHelp());
            preparedStatement.setString(14, request.getFamilyProblems());
            preparedStatement.setString(15, request.getReEducating());
            preparedStatement.setString(16, request.getVolunteerName());
            preparedStatement.setString(17, request.getVolunteerSurname());
            preparedStatement.setString(18, request.getVolunteerMiddlename());
            preparedStatement.setString(19, request.getVolunteersPhoneNumber());
            preparedStatement.executeUpdate();
            System.out.println("Inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void deleteUsers(String phoneNumber)
    {

        try
        {
            Statement statement = connection.createStatement();
            String query = "delete from Request where phoneNumber = " +phoneNumber;
            statement.executeUpdate(query);
            System.out.println("User has successfully deleted from DB!");
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
