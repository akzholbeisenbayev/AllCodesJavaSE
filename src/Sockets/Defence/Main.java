package Sockets.Defence;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main
{

    static ArrayList<Book> books = new ArrayList<>();

    public static final int port = 12335;

    public static void main(String[] args)
    {

        //Клиент подключается к серверу. Выходит панель для Клиента, нужно выбрать.
        // Я немного улучшил задачу и сделал 4 выбора

        // Выбор 1 как сказано в условии задачи сериализует и отправляет Объект класса Request в Сервер
        //Сервер улавливает это, его десериализует и читает. Создает объекты Book, добавляет их в Arraylist<Book>
        //Потом этому же объекту, который отправил Клиент устанавливает ArrayList, то есть дает книги из своей БД.
        //сериализует и отправляет это Клиенту. Клиент улавливает это, десериализует и читает, выводит на экран

        //Выбор 2 - создает объект Book, добавляет его в ЭррейЛист, выдает сообщение, что успешно добавлено

        //Выбор 3 - выводит на экран все книги

        //Выбор 0 - закрывает поток и выходит из сервера
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting for a client..");
            while (true)
            {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                Server server = new Server(socket);
                server.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

