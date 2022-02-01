package BitlabAcademy.OOP.Task7;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(10,"Leo","Messi","Forward");
        Player player1 = new Player(1,"Mark","Ter Stegen","Goalkeeper");
        Player player2 = new Player(3,"Gerrard","Pique","Defender");
        Player player3 = new Player(21,"Frenkie","De Jong","Defensive midfielder");
        Player player4 = new Player(8,"Riki","Puiq","Midfielder");
        Player player5 = new Player(17,"Kevin","De Bruyne","Midfielder");
        Player player6 = new Player(47,"Phil","Foden","Midfielder");
        Player player7 = new Player(20,"Silva","Bernardo","Attack Midfielder");
        Player player8 = new Player(3,"Ruben","Dias","Defender");
        Player player9 = new Player(9,"Jesus","Garbiel","Forward");

        Player [] players = new Player[5];
        players[0] = player;
        players[1]=player1;
        players[2]=player2;
        players[3]=player3;
        players[4]=player4;
        Player [] players1 = new Player[5];
        players1[0] = player5;
        players1[1]=player6;
        players1[2]=player7;
        players1[3]=player8;
        players1[4]=player9;

        Club club1 = new Club("Barcelona","Spain",90,players);
        Club club2 =new Club("Manchester City","England",95,players1);
        Club [] clubs = new Club[2];
        clubs [0] = club1;
        clubs [1] = club2;

        printClubData(clubs);
    }
    public static void printClubData(Club[]clubs){
        for(int i =0;i<clubs.length;i++){
            System.out.println(clubs[i].getClubData());
        }
    }
}