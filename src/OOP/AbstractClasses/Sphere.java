package OOP.AbstractClasses;

public class Sphere extends threeDshapes
{
    private int radius;
    private double pi = 3.14;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double Volume() {
        return (4.0/3.0 * getPi() * Math.pow(getRadius(), 3));
    }


    @Override
    public double surfaceArea() {
        return (4*getPi()* Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return("radius = " + getRadius() + '\n'
                + "Volume = " + Volume() + '\n' + "surfaceArea = " + surfaceArea() + '\n');
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
