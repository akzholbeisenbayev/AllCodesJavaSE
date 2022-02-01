package BitlabAcademy.SocketAndThreads.task2DanikB;



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run(){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData requestData;
            while(!socket.isClosed() && (requestData = (PackageData) inputStream.readObject()) != null){
                System.out.println(String.format("Client #%s sent request %s", id ,requestData.getOperationType()));

                switch (requestData.getOperationType()){
                    case SEND_MESSAGE:
                        System.out.println(String.format("Client #%s sent message - %s" ,id, requestData.getText()));
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
