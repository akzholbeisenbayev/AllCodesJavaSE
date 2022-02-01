package BitlabAcademy.OOP.AbstractClasses.Task2;

public class Chocolate extends Food{
    int weight;
    public Chocolate(int weight,String name) {
        super(name);
        this.weight = weight;
    }
    public double getCalories(){
        return weight*740;
    }

}