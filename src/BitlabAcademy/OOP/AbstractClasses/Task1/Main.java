package BitlabAcademy.OOP.AbstractClasses.Task1;

public class Main
{
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("twix" , 140);
        Chocolate chocolate1 = new Chocolate("snikers" , 150);

        Burger burger = new Burger("Burger King", 1 , 1);
        Burger burger1 = new Burger("McDonalds" , 2 ,2 );

        Coke coke = new Coke("Coca Cola", 1, true);
        Coke coke1 = new Coke("Fuse Tea" , 2, false);


        Food foods[] = {chocolate, chocolate1, burger, burger1, coke, coke1};

        //1,2,3,4,5\ array[i]

        double max = Double.MIN_VALUE; //-2 52335 523532525

        for(int  i = 0; i < foods.length; i++)
        {
            System.out.println(foods[i].getName() + " - " + foods[i].getCalories() + " Kkal" );

            if(foods[i].getCalories() >= max)
            {
                max = foods[i].getCalories();
            }
        }
        System.out.println("max= " + max + " Kkal");
    }
}
