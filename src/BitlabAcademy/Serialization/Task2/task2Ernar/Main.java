package BitlabAcademy.Serialization.Task2.task2Ernar;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Game>games = new ArrayList<>();
        Game game = null;
        Players player = null;
        while (true){
            System.out.println("PRESS 1 TO CREATE GAME"+"\n"+"PRESS 2 TO ADD PLAYER TO GAME"+"\n"+"PRESS 3 TO PLAY GAME"+"\n"+"PRESS 0 TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Insert Game name:");
                String gameName = in.next();
                System.out.println("Insert ip address:");
                String ipAddress = in.next();
                System.out.println("insert PORT:");
                int port = in.nextInt();
                game = new Game(gameName,ipAddress,port);
                saveGame(games);
            }else if(choice==2){
                for(int i = 0;i<games.size();i++){
                    System.out.println((i+1)+")"+"Game:"+games.get(i).getGameName()+"  IP Address:"+games.get(i).getIpAddress()+"  Port:"+games.get(i).getPort());
                }
                System.out.println("Choose Game index:");
                int index = in.nextInt();
                System.out.println("Nickname:");
                String nickName = in.next();
                System.out.println("Rating:");
                double rating = in.nextDouble();
                player = new Players(nickName,rating);

                game.addPlayer(player);
                saveGame(games);
            }
            else if(choice==3){
                if(player==null){
                    System.out.println("No players");
                }else{
                    saveGame(games);
                    for(Game g : games){
                        System.out.println(g.getGameName()+", "+g.getIpAddress()+", "+g.getPort()+","+g.getPlayers());
                    }}
            }else if(choice==0){
                System.exit(0);
            }
        }}
    public static void saveGame(ArrayList<Game>games){
        try {
            ObjectOutputStream outputStream = new
                    ObjectOutputStream(new FileOutputStream("settings.data"));
            outputStream.writeObject(games);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}