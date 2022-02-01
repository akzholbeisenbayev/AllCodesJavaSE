package OOP.AbstractClasses;

public class Cube extends threeDshapes
{
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double Volume() {
        return (Math.pow(getA(), 3));
    }


    @Override
    public double surfaceArea() {
        return (6*Math.pow(getA(), 2));
    }

    @Override
    public String toString() {
        return("storona = " + getA() + '\n'
                + "Volume = " + Volume() + '\n' + "surfaceArea = " + surfaceArea() + '\n');
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
