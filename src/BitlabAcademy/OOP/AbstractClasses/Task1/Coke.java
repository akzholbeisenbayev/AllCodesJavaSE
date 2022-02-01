package BitlabAcademy.OOP.AbstractClasses.Task1;

public class Coke extends Food
{
    private double volumeLiters; //1
    private boolean isSparkling; // Газированная или нет

    public double getCalories()
    {
        double temp = 1;
        if (isSparkling)
        {
            temp = volumeLiters * 400; //400
        }
        else
            temp = volumeLiters * 100; //100
        return temp;
    }

    public Coke(){

    }
    public Coke(String name, double volumeLiters,boolean isSparkling ) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }
}
