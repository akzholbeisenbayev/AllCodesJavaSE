
package Sockets.Defence;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread
{
    private Socket socket;

    ArrayList<Book> books = new ArrayList<>();

    public Server(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try
        {
            try
            {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

                Request temp = (Request) objectInputStream.readObject();

                if(temp.getOperationType().equals("LIST_BOOKS"))
                {
//                    Book b1 = new Book(1, "Belyi parohod", "Chingiz Aitmatov");
//                    Book b2 = new Book(2, "Ideal programmer", "Rovert Martin");
//                    Book b3 = new Book(3, "Introduction to Java", "Daniel Liang");
//                    Book b4 = new Book(4, "7 Habits of Highly Effective People ", "Stiven Kovi");
//                    Book b5 = new Book(5, "8 Habit", "Stiven Kovi");

//
//                    books.add(b1);
//                    books.add(b2);
//                    books.add(b3);
//                    books.add(b4);
//                    books.add(b5);

                    ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("books.Ernar"));


                    ArrayList<Book> books = (ArrayList<Book>)objectInputStream2.readObject();
                    temp.setBooks(books);
                    objectOutputStream.writeObject(temp);
                    objectInputStream2.close();
                }

                objectOutputStream.flush();
                objectInputStream.close();

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
