package BitlabAcademy.Socket.Example1;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {

        try{
            ServerSocket server = new ServerSocket(1989); //порт рандомный 62 000
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            String message = "";

            while((message = (String)inStream.readObject())!=null){
                System.out.println(message);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}