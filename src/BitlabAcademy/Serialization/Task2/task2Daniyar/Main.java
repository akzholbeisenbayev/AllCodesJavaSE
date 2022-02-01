package BitlabAcademy.Serialization.Task2.task2Daniyar;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        while (true)
        {
            System.out.println(" PRESS [1] TO CREATE GAME");
            System.out.println(" PRESS [2] TO ADD PLAYER TO GAME");
            System.out.println(" PRESS [3] TO PLAY GAME");
            System.out.println(" PRESS [0] TO EXIT");
            int chooice = in.nextInt();
            if(chooice == 1)
            {
                System.out.println("Game name[Gta, WarCraft]:  ");
                String GameNAme = in.next();
                System.out.println("IP address: ");
                String IpAdress = in.next();
                System.out.println("PORT:");
                int Port = in.nextInt();

                Game game = new Game(GameNAme, IpAdress, Port);
                ArrayList<Game> games = getGameList();
                games.add(game);
                saveGames(games);
            }
            else if(chooice == 2)
            {
                System.out.println("CHOOSE GAME: ");
                String GameName1 = in.next();
                if(GameName1.equalsIgnoreCase("Gta"))
                {
                    System.out.println("Nickname:");
                    String nickName = in.next();
                    System.out.println("Rating: ");
                    double rating = in.nextDouble();

                    Players pl = new Players(nickName, rating);
                    ArrayList<Players> players = getPlayersList();
                    players.add(pl);
                    addPlayer(players);
                }
                else if(GameName1.equalsIgnoreCase("WarCraft"))
                {
                    System.out.println("Nickname:");
                    String nickName = in.next();
                    System.out.println("Rating: ");
                    double rating = in.nextDouble();

                    Players pl = new Players(nickName, rating);
                    ArrayList<Players> players = getPlayersList();
                    players.add(pl);
                    addPlayer(players);
                }
                else
                    System.out.println("Bundai oiyn jok!!!");
            }
            else if(chooice == 3)
            {
                ArrayList<Game> games = getGameList();
                for(int i =0;i<games.size();i++)
                {
                    System.out.println((i+1) + ") "+games.get(i));
                    ArrayList<Players> players = getPlayersList();
                    for(int j=0;j<players.size();j++)
                    {
                        System.out.println((j+1) + ") " + players.get(j).toString());
                    }
                }
            }
            else if(chooice == 0)
            {
                System.exit(0);
            }
            else
                System.out.println("Kate san engizdiniz!!!");
        }
    }
    public static ArrayList<Game> getGameList()
    {
        ArrayList<Game> games = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            games = (ArrayList)inputStream.readObject();
            inputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return games;
    }
    public static ArrayList<Players> getPlayersList()
    {
        ArrayList<Players> players = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            players = (ArrayList)inputStream.readObject();
            inputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return players;
    }

    public static void addPlayer(ArrayList<Players> player)
    {
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            objectOutputStream.writeObject(player);
            objectOutputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void saveGames(ArrayList<Game> games)
    {
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            objectOutputStream.writeObject(games);
            objectOutputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
