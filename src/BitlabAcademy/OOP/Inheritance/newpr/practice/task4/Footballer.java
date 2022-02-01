package BitlabAcademy.OOP.Inheritance.newpr.practice.task4;

public class Footballer extends Sportsman{
    String position;
    String club;

    public Footballer(){}

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(position +  " " + club + " plays football");
    }
}