package Sockets.ExampleAgai;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name");
        String name = scanner.next();
        try{
            Socket socket = new Socket("127.0.0.1", 1400);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println("Insert message");
                String message = scanner.next();
                Person person = new Person(name, message);
                outputStream.writeObject(person);
                if ((person = (Person) inputStream.readObject())!=null){
                    System.out.println(person.getMessage());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
