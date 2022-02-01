package BitlabAcademy.Socket.Example1;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("127.0.0.1", 1989);

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                outStream.writeObject(in.next());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}