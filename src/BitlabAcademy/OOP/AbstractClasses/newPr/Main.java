package BitlabAcademy.OOP.AbstractClasses.newPr;

public class Main
{
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        Square s1 = new Square(40.1);

        Shape[] shapes = {c1, s1};

        for(int i=0; i<shapes.length; i++)
        {
            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());
        }
    }
}
