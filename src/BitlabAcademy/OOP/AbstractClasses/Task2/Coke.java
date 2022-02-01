package BitlabAcademy.OOP.AbstractClasses.Task2;

public class Coke extends Food {
    double volumeLiter;
    boolean isSparkling;
    public Coke(double volumeLiter, boolean isSparkling,String name) {
        super(name);
        this.volumeLiter = volumeLiter;
        this.isSparkling = isSparkling;
    }
    public double getCalories(){
        double temp = 1.1;
        if (isSparkling){
            temp=volumeLiter*400;
        }
        else{
            temp=volumeLiter*100;
        }
        return temp;
    }
}