package BitlabAcademy.OOP.AbstractClasses.Task1;

public abstract class Food
{
    private String name;

    public abstract double getCalories();

    public String getName()
    {
        return name;
    }
    public Food(){}

    public Food(String name)
    {
        this.name = name;
    }
}
