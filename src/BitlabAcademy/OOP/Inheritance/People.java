package BitlabAcademy.OOP.Inheritance;

public class People
{
    private String name;
    private String surname;
    private int height;
    private int age;

    public People(){}

    public People(String name){
        this.name = name;
    }

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void eat()
    {
        System.out.println(surname + " is eating");
    }

    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }
}
