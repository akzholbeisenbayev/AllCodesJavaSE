package Sockets.AksStudio;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
    public static final int port = 12345;
    public static final String host = "localhost";

    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket(host, port);
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

                while(true)
                {
                    System.out.print("Write message to Server: ");
                    String messageTo = bufferedReader.readLine();
                    if(messageTo.equals("stop")) break;
                    dataOutputStream.writeUTF(messageTo + "\n");
                    String messageFrom = dataInputStream.readUTF();
                    System.out.print("Message from Server: " + messageFrom);

                }
                dataOutputStream.flush();
                dataOutputStream.close();
                dataInputStream.close();

            }catch (IOException e)
            {
                e.printStackTrace();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
