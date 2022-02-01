package com.company.Knight;


public abstract class Ammunition
    //аммуниции
{
    private int cost;
    private double weight;

    //конструктор
    public Ammunition(int cost, double weight)
    {
        this.cost = cost;
        this.weight = weight;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    //сеттеры
    public void setCost(int cost) throws Exception {
        if (cost < 0) {
            throw new Exception("Cost can't be less than 0!");
        }
        this.cost = cost;
    }

    public void setWeight(double weight) throws Exception {
        if (weight < 0) {
            throw new Exception("Weight can't be less than 0!");
        }
        this.weight = weight;
    }

    //геттеры
    public int getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }




}
