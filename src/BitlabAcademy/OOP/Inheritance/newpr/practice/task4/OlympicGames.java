package BitlabAcademy.OOP.Inheritance.newpr.practice.task4;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];

    public OlympicGames(){}

    public OlympicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

}