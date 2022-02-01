package Sockets.AksStudio;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static final int port = 12345;

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Waiting for client");
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("Client has connected ");

            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                while(true)
                {
                    String messageFrom = dataInputStream.readUTF();
                    System.out.print("Message from Client: " + messageFrom);
                    System.out.print("Write message to Client: ");
                    String messageTo = bufferedReader.readLine();
                    if(messageTo.equals("stop")) break;
                    dataOutputStream.writeUTF(messageTo + "\n");

                }
                dataOutputStream.flush();
                dataOutputStream.close();
                dataInputStream.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
