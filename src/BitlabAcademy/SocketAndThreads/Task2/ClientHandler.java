package BitlabAcademy.SocketAndThreads.Task2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData pd = null;
            while ((pd = (PackageData) inputStream.readObject()) != null) {
                PackageData pack = new PackageData(pd.getTextField());
                outputStream.writeObject(pack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}