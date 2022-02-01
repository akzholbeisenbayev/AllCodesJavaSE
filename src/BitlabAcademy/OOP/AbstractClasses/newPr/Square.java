package BitlabAcademy.OOP.AbstractClasses.newPr;

public class Square extends Shape
{
    double width;

    public Square(){
        this.width = width;
    }

    public Square(double width){
        this.width = width;
    }

    @Override
    public double getArea(){
        return width*width;
    }

    @Override
    public double getPerimeter(){
        return 4*width;
    }
}
