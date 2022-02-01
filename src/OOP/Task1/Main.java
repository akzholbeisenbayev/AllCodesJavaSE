package OOP.Task1;

public class Main
{

    //1. Define 5 classes/interfaces/abstract classes you can have there. Only enlist them.
    //2. Implement 1 class from question 1 - fields/methods/get set/ constructors/equals/toString/clone
    //3. Show inheritance examples and overriding/overloading of any method you like
    //4. Give example of runtime polymorphism
    //5. Implement Comparable interface and write 1 comparator. For what will you use it?

    //Krysha
    //Realty, Rentals, Sales, Companies, Main
    public static void main(String[] args) throws Exception
    {
        Rentals rentals = new Rentals("flat", "Almaty", 1, 210000, 3);
        if(rentals.getType().equals("flat")) System.out.println("Type is flat");
        System.out.println(rentals.toString());

        rentals.clone();

        rentals.polymorph(rentals.getDuration());
        rentals.polymorph(rentals.getCity());

        Rentals rentalsCompary = new Rentals("flat", "Astana", 1, 240000, 3);
        System.out.println(rentals.compareTo(rentalsCompary));

    }
}
