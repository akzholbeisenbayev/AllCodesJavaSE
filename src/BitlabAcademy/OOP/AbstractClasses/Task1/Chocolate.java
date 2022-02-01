package BitlabAcademy.OOP.AbstractClasses.Task1;

public class Chocolate extends Food
{
    int weight ;
    public double getCalories()
    {
        return weight * 740;
    }

    public Chocolate(){}
    public Chocolate(String name, int weight)
    {
        super(name);
        this.weight = weight;
    }
}
