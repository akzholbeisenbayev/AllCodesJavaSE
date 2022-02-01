package BitlabAcademy.SocketAndThreads.task2Danik;

import BitlabAcademy.SocketAndThreads.Task1.Book;
import BitlabAcademy.SocketAndThreads.Task1.PackageData;
import BitlabAcademy.SocketAndThreads.Task2Tima.MessageData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id){
        this.id = id;
        this.socket = socket;
    }

    public void run(){
        try{
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            BitlabAcademy.SocketAndThreads.Task2Tima.MessageData data = null;
            while((data = (MessageData) inStream.readObject())!=null){
                System.out.println(data);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void saveBooks(ArrayList<Book> books) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("books.data"));
            outStream.writeObject(books);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}