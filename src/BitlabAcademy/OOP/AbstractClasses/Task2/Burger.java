package BitlabAcademy.OOP.AbstractClasses.Task2;

public class Burger extends Food {


    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }

    int meatAmount;

    public int getMeatAmount() {
        return meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    int meatType;
    public Burger(int meatAmount, int meatType,String name) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }
    public double getCalories(){
        int temp = 1;
        if (meatType==1){
            temp=meatAmount*840;
        }
        else if (meatType==2){
            temp=meatAmount*560;
        }
        return temp;
    }
}