package BitlabAcademy.Files.ThirdExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS [1] TO ADD PLAYER");
            System.out.println("PRESS [2] TO LIST PLAYERS");
            System.out.println("PRESS [3] TO DELETE PLAYER");
            System.out.println("PRESS [4] TO GET TOTAL ANALYTICS ON PLAYERS PRICE");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name");
                String name = in.next();

                System.out.println("Insert club");
                String club = in.next();

                System.out.println("Insert price");
                int price = in.nextInt();

                Player pl = new Player(name, club, price);
                ArrayList<Player> players = readPlayers();//2
                players.add(pl);
                savePlayers(players); //3

            }else if(choice.equals("2")){

                ArrayList<Player>  players = readPlayers();
                for (int i = 0; i<players.size(); i++) {
                    System.out.println((i+1) + ") "+players.get(i).toString()); // Выводим данные игрока в красивом формате, с нумерацией
                }

            }else if (choice.equals("3")){

                ArrayList <Player>  players = readPlayers();
                for (int i = 0; i<players.size(); i++) {
                    System.out.println((i+1) + ") "+players.get(i).toString()); // Выводим данные игрока в красивом формате, с нумерацией
                }

                System.out.println("Insert index of player to delete: ");
                int index = in.nextInt(); //Вводим порядковый номер игрока из списка от 1 до размера
                players.remove(index-1);

                savePlayers(players);

            }else if(choice.equals("4")){

                int sum = 0;
                //Получаем актуальные данные
                ArrayList<Player> players = readPlayers();

                for (Player p: players){
                    sum+=p.getPrice();
                }

                System.out.println("The total cost of the players "+sum);

            }else if (choice.equals("0")){

//                System.exit(0); // Выход из программы
                    break;
            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static void savePlayers(ArrayList<Player> players){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("players.txt"));
            //Цикл foreach. Добавим в конце \n. Каждый параметр будет записан в каждой строке.
            for (Player p : players) {
                bw.write(p.getName()+"\n");
                bw.write(p.getClub()+"\n");
                bw.write(p.getPrice()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Создадим метод который не просто будет считывать, а будет полностью конвертировать данные обратно в ArrayList<Player>
    public static ArrayList<Player> readPlayers(){
        ArrayList<Player> players = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("players.txt"));
            String line = "";
            while((line = br.readLine())!=null)
            { //Первая линия всегда будет именем игрока
                String club = br.readLine(); //Вытягиваем клуб - Real
                int price = Integer.parseInt(br.readLine()); //Вытягиваем цену сконвертировав в int 5000000

                players.add(new Player(line, club, price)); //Заново создаем новый объект игрока и добавляем в массив

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return players;
    }
}
