package BitlabAcademy.OOP.AbstractClasses.Task1;

public class Burger extends Food{
    private int meatAmount;
    private int meatType;

    public double getCalories()
    {
        int calories = 1;
        if(meatType == 1)
        {
            calories = meatAmount * 840;
        }
        else if(meatType == 2)
            calories = meatAmount * 560;
        return calories;
    }
    public Burger(){}
    public Burger(String name, int meatAmount,int meatType )
    {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }
}
