package BitlabAcademy.Socket.p;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(1998);
            Socket socket = server.accept();
            System.out.println("Client is connected");
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData data = null;
            while((data = (MessageData) inStream.readObject())!=null){
                System.out.println(data);
                MessageData response = new MessageData("Server", "hello");
                outputStream.writeObject(response);
            }
            outputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
