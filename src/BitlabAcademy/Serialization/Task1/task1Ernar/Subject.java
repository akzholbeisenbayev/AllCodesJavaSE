package BitlabAcademy.Serialization.Task1.task1Ernar;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private int credits;

    public Subject(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString(){
        return "Name: "+ getName()+"  Credits:"+getCredits();
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
}