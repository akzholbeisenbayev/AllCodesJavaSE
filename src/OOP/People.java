package OOP;

public class People
{
   private String name;
   protected int age;
    public int height;
    int a;

    public People(){}

    public People(String name, int age, int height)
    {
        this.name = name;//"Aidos"
        this.age = age;
        this.height = height;
    }

    public void run(){
        System.out.println("Name: " + name + ", age: " + age
                + ", height: " + height + " is running ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
