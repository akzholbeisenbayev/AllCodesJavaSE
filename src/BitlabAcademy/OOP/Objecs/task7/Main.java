package BitlabAcademy.OOP.Objecs.task7;

public class Main
{
    public static void main(String[] args) {

        Player p1 = new Player(1, "Oleg", "Mun", "1st");
        Player p2 = new Player(2, "Danya", "Bulegenov", "2nd");
        Player p3 = new Player(3, "Dauren", "Abylkassym", "3rd");
        Player p4 = new Player(4, "Aziza", "Baktibaeva", "4th");
        Player p5 = new Player(5, "Dilnaz", "Sagindik", "5th");
        Player[] players1 = {p1, p2, p3, p4, p5};

        Player r1 = new Player(1, "Balzhan", "Altai", "1st");
        Player r2 = new Player(2, "Maksat", "Oraz", "2nd");
        Player r3 = new Player(3, "Ibrahim", "Kuandik", "3rd");
        Player r4 = new Player(4, "Maxim", "Haritonov", "4th");
        Player r5 = new Player(5, "Dair", "Kataev", "5th");
        Player[] players2 = {r1, r2, r3, r4, r5};

        Club club1 = new Club("Club1", "Kazakhstan", 100, players1);
        Club club2 = new Club("Club2", "Russia", 200, players2);

        Club[] clubs = {club1, club2};

        System.out.println("______________________________________________________");
        for(int i = 0; i < 2; i++){
            clubs[i].printClubData();
            System.out.println("______________________________________________________");
        }
    }
}
