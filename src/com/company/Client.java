package com.company;

import java.net.Socket;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client
{

    public static String host = "localhost";
    public static int port = 1508;

    public static void main(String[] args) throws InputMismatchException
    {
        Scanner cin = new Scanner(System.in);

        try
        {
            Socket socket = new Socket(host, port);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            ArrayList<Student> students = new ArrayList<>();

            while (true){
                System.out.println("PRESS [1] to LIST STUDENTS");
                System.out.println("PRESS [2] to ADD STUDENTS");
                System.out.println("PRESS [3] to EXIT");

                int choice = cin.nextInt();

                if(choice == 1)
                {
                    PackageData packageData = new PackageData("LIST_STUDENTS");
                    oos.writeObject(packageData);
                    oos.flush();

                    students = (ArrayList<Student>)ois.readObject();

                    for (Student s : students)
                    {
                        System.out.println(s.toString());
                    }
                }

                else if(choice == 2)
                {
                    System.out.print("Enter id: ");
                    int id = cin.nextInt();
                    System.out.print("Enter name: ");
                    String name = cin.next();
                    System.out.print("Enter surname: ");
                    String surname = cin.next();
                    System.out.print("Enter age: ");
                    int age = cin.nextInt();


                    PackageData packageData = new PackageData("ADD_STUDENTS");
                    packageData.students.add(new Student(id, name, surname,age));

                    oos.writeObject(packageData);
                    packageData = (PackageData)ois.readObject();
                    oos.flush();
                    System.out.println("Student has successfully added!");
                }

                else if(choice == 3)
                {
                    socket.close();
                    break;
                }

                else
                    {
                        System.out.println("There is no that choice, please choose 1/2/3");
                    }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}