package Sockets.ExampleAgai;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class ClientThread extends Thread {

    private Socket socket;
    private int id;
    public ClientThread( Socket socket, int id ) {
        this.socket = socket;
        this.id = id;
    }
    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            Person person = null;
            while ((person = (Person) inputStream.readObject())!=null){
                System.out.println("id: " + id + " " + person.toString());
                if ((person.getMessage().toLowerCase().contains("hello"))){
                    person.setMessage("hello from server");
                    outputStream.writeObject(person);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
