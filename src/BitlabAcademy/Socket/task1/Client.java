package BitlabAcademy.Socket.task1;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String Username =scanner.next();
        try{
            Socket socket = new Socket("localhost", 1889);
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                System.out.println(
                        "PRESS [1] TO SEND MESSAGE\n" +
                                "PRESS [2] TO EXIT");
                int n = scanner.nextInt();
                if (n == 1) {
                    System.out.println("Insert message: ");
                    String messageText = scanner.next();
                    Date date = new Date();
                    MessageData m = new MessageData(Username, messageText, date);
                    outStream.writeObject(m);
                    if ((m = (MessageData) inputStream.readObject()) != null) {
                        System.out.println(m.getMessageText());
                    }
                }else if(n==0){
                    System.exit(0);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
