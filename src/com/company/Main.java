package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static int port = 1508;

    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/student_db?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String password ="";


    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying to connect to database");
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("We have successfully connected to database! :)");
            System.out.println();

        }
        catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }


        try
        {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true)
            {
                Socket socket = serverSocket.accept();

                Thread t = new Thread(new ClientThread(socket));
                t.start();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void addStudent(Student student)
    {
        try
        {
            String query ="insert into students(id, name, surname,age) values(?,?,?,?) ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getSurname());
            preparedStatement.setInt(4,student.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public static ArrayList<Student> ListStudents()
    {
        ArrayList<Student> students = new ArrayList<>();
        try
        {
            Statement statement = connection.createStatement();
            String query ="select *from students ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                students.add(new Student(id,name,surname,age));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return students;
    }

}

