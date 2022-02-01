package BitlabAcademy.Serialization.Task2.task2Akzhol;



import BitlabAcademy.OOP.Task7.Player;

import java.io.Serializable;

public class Players implements Serializable {
    private String nickName;
    private double rating;

    Players(){}
    Players(String nickName, double rating){
        this.nickName=nickName;
        this.rating=rating;
    }

    public void setNickName(String nickName){this.nickName=nickName;}
    public String getNickName(){return nickName;}

    public void setRating(double rating){this.nickName=nickName;}
    public double getRating(){return rating;}

    @Override
    public String toString(){
        return nickName+" = "+rating;
    }
}