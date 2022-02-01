package BitlabAcademy.Socket.task1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1889);
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData data = null;
            while ((data = (MessageData) inStream.readObject()) != null) {
                System.out.println(data.getMessageText() + " from " + data.getUserName() + " " + data.getSentDate());
                Date date = new Date();
                MessageData response = new MessageData("Server", "hello", date);
                outputStream.writeObject(response);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}