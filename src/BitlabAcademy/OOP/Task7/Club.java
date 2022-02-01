package BitlabAcademy.OOP.Task7;

import java.util.Arrays;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club(){}
    public Club(String name,String country,int ratingPoints,Player[]players){
        this.name=name;
        this.country=country;
        this.ratingPoints=ratingPoints;
        this.players=players;
    }

    public int getRatingPoints(){
        return ratingPoints;
    }
    public String getClubData(){return "ratingPoints:"+ratingPoints+"  Name:"+name+"  Country:"+country+"  Players:"+ Arrays.toString(players);}
}
