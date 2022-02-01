package BitlabAcademy.Serialization.Task1.task1Daniyar;

import java.io.Serializable;

public class Subject implements Serializable

{
    private String name1;
    private int credits;
    public Subject()
    {}
    public Subject(String name1, int credits)
    {
        this.name1 = name1;
        this.credits = credits;
    }

    public void getData2()
    {
        System.out.println(getName() + ", " + getCredits());
    }
    public String getName() {
        return this.name1;
    }
    public int getCredits() {
        return this.credits;
    }
    public void setName(String name) {
        this.name1 = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public String toString()
    {
        return name1 + credits;
    }
}