package BitlabAcademy.OOP.Inheritance.newpr.practice.task4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Gymnast sportsman1 = new Gymnast("fullname", 26, "Kazakhstan", 177, 71, "gymnast");
        Gymnast sportsman2 = new Gymnast("fullname", 26, "Kazakhstan", 177, 71, "gymnast");
        Gymnast sportsman3 = new Gymnast("fullname", 26, "Kazakhstan", 177, 71, "gymnast");

        Footballer sportsman4 = new Footballer("Cristiano Ronaldo", 36, "Portugal", "Forward", "MU");
        Footballer sportsman5 = new Footballer("Cristiano Ronaldo", 36, "Portugal", "Forward", "MU");
        Footballer sportsman6 = new Footballer("Cristiano Ronaldo", 36, "Portugal", "Forward", "MU");

        Swimmer sportsman7 = new Swimmer("Arman Ospanov", 21, "Kazakhstan", "butterfly", 20.5);
        Swimmer sportsman8 = new Swimmer("Arman Ospanov", 21, "Kazakhstan", "standard", 20);
        Swimmer sportsman9 = new Swimmer("Arman Ospanov", 21, "Kazakhstan", "butterfly", 17.5);

        OlympicGames sportsmen = new OlympicGames();



        sportsmen.sportsmansList = new Sportsman[]{sportsman1, sportsman2, sportsman3, sportsman4, sportsman5, sportsman6, sportsman7, sportsman8, sportsman9};

        for(int i = 0; i < 9; i++){
            sportsmen.sportsmansList[i].play();
        }
    }
}
