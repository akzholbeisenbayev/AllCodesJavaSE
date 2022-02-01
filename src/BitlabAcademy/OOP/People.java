package BitlabAcademy.OOP;

public class People
{
    private String name;
    String surname;
    int age;
    int height;

    public People(){

    }

    //max gpa

    public People(String name, String surname, int age, int height)
    {
        this.name  = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void getData()
    {
        System.out.println("Name: " + name + ", Surname: " + surname + ", age: " + age+ ", Height: " + height);
    }


}
