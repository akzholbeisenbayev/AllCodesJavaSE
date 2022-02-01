package BitlabAcademy.OOP.Inheritance.newpr.practice.task4;

public class Gymnast extends Sportsman{
    int height;
    int weight;
    String style;

    public Gymnast(){}

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(height + " " + weight + " " + style + " does gymnastic");
    }
}
