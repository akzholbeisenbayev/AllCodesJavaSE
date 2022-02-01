package com.company.FlowerGirl;
//Цветок
public abstract class Flower
{
    private String name;

    private int price;

    //конструктор
    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price='" + price;
    }

    //сеттеры
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Name can't be empty!");
        }
        this.name = name;
    }

    public void setPrice(int price) throws Exception {
        if (price < 0) {
            throw new Exception("Price can't be less than 0!");
        }
        this.price = price;
    }


    //геттеры
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
