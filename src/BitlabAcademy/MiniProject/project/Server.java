package BitlabAcademy.MiniProject.project;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students(1L, "Gulbarshyn", "Utegen", 20));
        students.add(new Students(2L, "Aidana", "Nygmetolla", 25));
        students.add(new Students(3L, "Nurdana", "Isagalieva",31));
        try {
            ServerSocket server = new ServerSocket(1402);
            System.out.println("Waiting for Client!");
            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected!");
                Main ch = new Main(socket, students);
                ch.start();
            }
        } catch (Exception e){

        }
    }
}