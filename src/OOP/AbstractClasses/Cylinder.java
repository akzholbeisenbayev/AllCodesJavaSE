package OOP.AbstractClasses;

public class Cylinder extends threeDshapes
{
    private int radius;
    private int h;
    private double pi = 3.14;


    public Cylinder(int radius, int h) {
        this.radius = radius;
        this.h = h;
    }

    @Override
    public double Volume() {
       return getPi() * Math.pow(getRadius(),2) * getH();
    }

    @Override
    public double surfaceArea() {
        return 2*getPi()*getRadius()*getH();
    }

    @Override
    public String toString() {
        return("radius = " + getRadius() + '\n' + "H = " + getH()+ '\n'
                + "Volume = " + Volume() + '\n' + "surfaceArea = " + surfaceArea() + '\n');
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
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
