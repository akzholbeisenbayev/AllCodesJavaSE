package BitlabAcademy.SocketAndThreads.Task2;

import java.io.IOException;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",5879);
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}