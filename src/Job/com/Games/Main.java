package Job.com.Games;

//Создать список объектов Игрушки.
// Найти список настольных игр.
// Подсчитать количество машин.
// Отсортировать по стоимости.

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{


    public static void main(String[] args)
    {
        Toys t1 = new Toys("table-games", 1.34, 15000);
        Toys t2 = new Toys("cars", 1.54, 2400);
        Toys t3 = new Toys("babies", 0.78, 6600);
        Toys t4 = new Toys("dolls", 0.84, 7000);
        Toys t5 = new Toys("balls", 0.64, 3000);

        ArrayList<Toys> toys = new ArrayList<>();
        toys.add(t1);
        toys.add(t2);
        toys.add(t3);
        toys.add(t4);
        toys.add(t5);

        System.out.println("Spisok vseh igrushek:");
        System.out.println();
        for(Toys t:toys)
        {
            System.out.println(t.toString());
        }

        System.out.println();

        System.out.println("Spisok nastolnih igr:");
        for(Toys t:toys)
        {
            if(t.getType().equals("table-games"))
                System.out.println(t.toString());
        }

        System.out.println();

        int count = 0;
        for(Toys t:toys)
        {
            if(t.getType().equals("cars"))
                count++;
        }
        System.out.println("Kolichestvo mashin = " + count);
        System.out.println();

        System.out.println("Posle sortirovki po stoimosti:");
        System.out.println();

        toys.sort(Comparator.comparingInt(Toys::getCost));
        for(Toys t:toys)
        {
            System.out.println(t.toString());
        }
    }

}

class Toys
{
    private String type;
    private double weight;
    private int cost;

    public Toys(String type, double weight, int cost) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "type: '" + type + '\'' +
                ", weight: " + weight +
                ", cost: " + cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
