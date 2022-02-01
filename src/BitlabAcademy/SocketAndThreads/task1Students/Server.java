package BitlabAcademy.SocketAndThreads.task1Students;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

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

        }
    }
}
