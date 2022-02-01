package com.company.Knight;

public class Armor extends Ammunition {

    private int health;
    private String size;

    //конструктор
    public Armor(int health, String size, int cost, double weight) {
        super(cost, weight);
        this.health = health;
        this.size = size;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return "Armor{" +
                "health=" + health +
                ", size='" + size + '\'' + " " + super.toString();
    }

    //сеттеры
    public void setHealth(int health) throws Exception {
        if (health < 0) {
            throw new Exception("Health can't be less than 0!");
        }
        this.health = health;
    }

    public void setSize(String size) throws Exception {
        if (size == null) {
            throw new Exception("Size is null!");
        }
        this.size = size;
    }

    //геттеры
    public int getHealth() {
        return health;
    }

    public String getSize() {
        return size;
    }


}

