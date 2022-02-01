package BitlabAcademy.SocketAndThreads.Task2;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class Server {
    public static void main(String[]args){
        try {
            ServerSocket server = new ServerSocket(5879);
            System.out.println("Waiting for Client!");
            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected!");
                ClientHandler ch = new ClientHandler(socket);
                sleep(550);
                ch.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}