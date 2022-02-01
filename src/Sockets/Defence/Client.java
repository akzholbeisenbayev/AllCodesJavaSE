package Sockets.Defence;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Client
{
    public static final int port = 12335;
    public static final String host = "localhost";

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner cin = new Scanner(System.in);

        try
        {
            Socket socket = new Socket(host, port);
            try
            {
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());


                while(true)
                {
                    System.out.println("Press [1] to LIST_BOOKS_FROM_SERVER");
                    System.out.println("Press [2] to ADD_BOOK");
                    System.out.println("Press [3] to SHOW ALL BOOKS");
                    System.out.println("Press [0] to DISCONNECT_FROM_SERVER");

                    int choice = cin.nextInt();
                    if(choice == 0)
                    {
                        objectOutputStream.close();
                        socket.close();
                        break;
                    }

                    if(choice == 1)
                    {
                        Request r1 = new Request("LIST_BOOKS");
                        objectOutputStream.writeObject(r1);
                        Request temp = (Request) objectInputStream.readObject();
                        if(temp.getBooks()!=null)
                        {
                            System.out.println(temp.getBooks());
                            Main.books = temp.getBooks();
                        }else System.out.println("Books are empty");
                    }

                    if(choice == 2)
                    {
                        System.out.println();
                        System.out.print("Write id: ");
                        int id = cin.nextInt();
                        System.out.print("Write name: ");
                        String name = cin.next();
                        System.out.print("Write author: ");
                        String author = cin.next();
                        Book book = new Book(id, name, author);
                        Main.books.add(book);
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("books.Ernar"));
                        objectOutputStream2.writeObject(Main.books);

                        objectOutputStream2.close();
                        System.out.println("Book has successfully added!");
                        System.out.println();
                    }

                }

                objectInputStream.close();
                objectOutputStream.flush();

            }catch (FileNotFoundException e)
            {
                System.out.println("File not find");
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

