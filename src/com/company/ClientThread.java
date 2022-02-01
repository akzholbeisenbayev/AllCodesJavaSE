package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientThread extends Thread
{
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public ClientThread(Socket socket)
    {
        this.socket = socket;
    }

    public ClientThread(Socket socket, ObjectInputStream ois, ObjectOutputStream oos)
    {
        this.socket = socket;
        this.ois = ois;
        this.oos = oos;
    }

    @Override
    public void run()
    {
        try
        {
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
            while (true)
            {
                PackageData packageData = (PackageData)ois.readObject();

                if(packageData.getOperationType().equals("LIST_STUDENTS"))
                {
                    oos.writeObject(Main.ListStudents());
                }
                else if(packageData.getOperationType().equals("ADD_STUDENTS"))
                {
                    Main.addStudent(packageData.students.get(packageData.students.size()-1));
                    oos.writeObject(packageData);
                }


            }
        } catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        try
        {
            this.ois.close();
            this.oos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}