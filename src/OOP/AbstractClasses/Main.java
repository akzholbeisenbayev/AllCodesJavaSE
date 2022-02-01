package OOP.AbstractClasses;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("_______________________________________________");
        System.out.println("Cylinder: ");
        System.out.println();
        Cylinder c1 = new Cylinder(5, 4);
        System.out.println(c1.toString());

        System.out.println("_______________________________________________");
        System.out.println("Sphere: ");
        System.out.println();
        Sphere s1 = new Sphere(5);
        System.out.println(s1.toString());

        System.out.println("_______________________________________________");
        System.out.println("Cube: ");
        System.out.println();
        Cube cube = new Cube(5);
        System.out.println(cube.toString());

    }
}
