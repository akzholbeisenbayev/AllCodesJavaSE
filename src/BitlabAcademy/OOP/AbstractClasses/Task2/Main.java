package BitlabAcademy.OOP.AbstractClasses.Task2;

public class Main {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate(200,"Snickers");
        Chocolate chocolate1 = new Chocolate(200,"Twiw");
        Burger burger = new Burger(2,1,"Burger king");
        Burger burger1 = new Burger(1,2,"MacDonalds");
        Coke coke = new Coke(2.5,true,"Coca Cola");
        Coke coke1 = new Coke(1.5,false,"Fuse Tea");

        Food[]foods = {chocolate,chocolate1,burger,burger1,coke,coke1};
        double max = Double.MIN_VALUE;

        for (int i = 0;i<foods.length;i++) {
            if (foods[i].getCalories > max) {
                max = foods[i].getCalories;
            }
        }

        for (int i = 0;i<foods.length;i++) {
            System.out.println(foods[i].getName());
        }
        System.out.println(max);
    }
}
