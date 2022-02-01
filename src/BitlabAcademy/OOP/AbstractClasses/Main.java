package BitlabAcademy.OOP.AbstractClasses;

public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s1 = new Square(5);
        Square s2 = new Square(15);
        Shape figures[] = new Shape[3];

        figures[0] = c;
        figures[1] = s1;
        figures[2] = s2;

        for (int i=0;i<figures.length; i++) {
            figures[i].printArea();
        }
    }
}

