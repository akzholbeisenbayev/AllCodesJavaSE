package BitlabAcademy.ArrayList;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Players player1 = new Players("Messi", 6500000, 35);
        Players player2 = new Players("Ronaldo", 6589000, 37);
        Players player3 = new Players("Neymar", 7896541, 36);
        Players player4 = new Players("Dani Alves", 6987412, 40);
        Players player5 = new Players("Sergi", 5647123, 32);
        Players player6 = new Players("Jordi Alba", 23156478, 31);
        Players player7 = new Players("Suarez", 4569871, 30);
        Players player8 = new Players("Rakitic", 6549631, 28);
        Players player9 = new Players("Ter-Shtegen", 4786321, 34);
        Players player10 = new Players("Adriano", 9863251, 31);
        ArrayList<Players> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);

        int sumAVG = 0, k=1;
        int sumAge=0;
        for(int i=0; i<players.size(); i++){
            int avgPrice=sumAVG/k;
            sumAVG+=players.get(i).getPrice();
            k++;
        }
        System.out.println("Average price is: "+sumAVG);
        for(int i=0; i<players.size(); i++){
            sumAge+=players.get(i).getAge();
        }
        System.out.println("Sum of ages: " + sumAge);
    }
}