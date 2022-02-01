package OOP;

public class Main1
{
    public static void main(String[] args) {
        People h1 = new People();
        //h1.name = "Arman";
        h1.setName("Arman");
        h1.age = 27;
        h1.height = 185;

        System.out.println(h1.getName());
        h1.run();

        People h2 = new People("Aidos", 43, 175);

    }
}
