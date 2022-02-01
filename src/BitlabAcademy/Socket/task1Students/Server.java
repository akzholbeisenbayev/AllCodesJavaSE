package BitlabAcademy.Socket.task1Students;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(1989);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            MessageData data = null;
            while((data = (MessageData) inStream.readObject())!=null){
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}