package BitlabAcademy.Serialization.newExample;

import java.io.Serializable;

public class User implements Serializable
{
    private String name;
    private int number;


    public User(String name, int number)
    {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
