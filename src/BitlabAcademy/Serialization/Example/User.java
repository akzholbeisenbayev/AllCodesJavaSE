package BitlabAcademy.Serialization.Example;

import java.io.Serializable;

public class User implements Serializable
{
    private String name;
    private int number;

    public User(){
        this.name = "No Number";
        this.number = 0;
    }
    public User(String name, int number){
        this.name = name;
        this.number = number;
    }
    public void setName(String name) throws Exception {
        try {
            if (name.equals("")) {
                throw new NameException();
            }
        }catch (NameException e)
        {
            System.out.println(e.getString());
        }
        this.name = name;
    }
    public void setNumber(int number){
       // if(number<0)

        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
}
