package BitlabAcademy.SocketAndThreads.task2DanikB;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnector {
    private Socket socket;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    public ServerConnector(Socket socket) {
        try {
            this.socket = socket;
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String text){
        try{
            PackageData pd = new PackageData(CommandEnum.SEND_MESSAGE,text);
            outputStream.writeObject(pd);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}