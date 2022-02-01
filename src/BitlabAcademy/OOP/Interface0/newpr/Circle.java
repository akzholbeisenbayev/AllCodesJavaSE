package BitlabAcademy.OOP.Interface0.newpr;


public class Circle implements Graphics,Shape
{
    double radius;
    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing");
    }

    @Override
    public double getArea() {
        return  3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}
