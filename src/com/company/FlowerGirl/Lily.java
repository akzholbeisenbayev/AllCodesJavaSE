package com.company.FlowerGirl;

//Лилейные(семейство цветов)
//Лилия, Тюльпан
public class Lily extends Flower
{
    private double length;
    private String colour;

    //конструктор
    public Lily(String name, int price, double length, String colour) {
        super(name, price);
        this.length = length;
        this.colour = colour;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return super.toString() +
                ", length=" + length +
                ", colour=" + colour;
    }

    //сеттеры
    public void setLength(double length) throws Exception {
        if (length < 0) {
            throw new Exception("Length can't be less than 0!");
        }
        this.length = length;
    }

    public void setColour(String colour) throws Exception {
        if (colour == null) {
            throw new Exception("Colour can't be empty!");
        }
        this.colour = colour;
    }


    //геттеры
    public double getLength() {
        return length;
    }

    public String getColour() {
        return colour;
    }

}
