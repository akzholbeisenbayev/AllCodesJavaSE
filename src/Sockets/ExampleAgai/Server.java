package Sockets.ExampleAgai;

import java.net.ServerSocket;
import java.net.Socket;
@SuppressWarnings("all")
public class Server
{
    public static void main( String[] args ) {
        int id = 0;
        try{
            System.out.println("Waiting for client");
            ServerSocket serverSocket = new ServerSocket(1400);
            while (true){
                Socket socket1 = serverSocket.accept();
                id++;
                ClientThread clientThread = new ClientThread(socket1, id);
                clientThread.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
