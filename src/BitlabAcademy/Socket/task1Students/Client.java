package BitlabAcademy.Socket.task1Students;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",1989);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int choice = in.nextInt();
                if (choice == 1){
                    System.out.println("Insert message:");
                    String message = in.nextLine();
                    MessageData pd = new MessageData(name, message);
                    outputStream.writeObject(pd);
                }else if(choice == 2){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}