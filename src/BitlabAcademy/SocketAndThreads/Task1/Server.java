package BitlabAcademy.SocketAndThreads.Task1;

import java.net.ServerSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Guliver", "author"));
        books.add(new Book(2, "Mulan", "author2"));
        books.add(new Book(3, "Time", "author3"));

        try {
            ServerSocket server = new ServerSocket(1234);
            System.out.println("Waiting for Client!");
            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected!");
                ClientHandler ch = new ClientHandler(socket, books);
                ch.start();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}