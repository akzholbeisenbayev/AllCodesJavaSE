package BitlabAcademy.MiniProject.project;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread{
    private Socket socket;
    public Main(Socket socket, ArrayList<Students> students) {
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        try {
            Socket socket = new Socket("localhost", 1402);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();
    }
}