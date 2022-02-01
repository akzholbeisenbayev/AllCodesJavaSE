package com.company.Airline;


//Создаем Абстрактный класс
public abstract class Plane extends Transport {
    //Создаем атрибуты
    private int capacity;
    private int carrying;
    private int distance;

    //Конструктор по умолчанию
    public Plane() {
    }

    //Конструктор со значениями

    public Plane(String type, int weight, int capacity, int carrying, int distance) {
        super(type, weight);
        this.capacity = capacity;
        this.carrying = carrying;
        this.distance = distance;
    }

    //Создаем абстрактный метод для вывода информации о самолете
    public abstract void showDetalis();

    //Геттеры и Сеттеры
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws Exception {
        if (capacity < 0)
        {
            throw new Exception("Capacity can't be less than 0!");
        }
        this.capacity = capacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) throws Exception {
        if (carrying < 0)
        {
            throw new Exception("Carrying can't be less than 0!");
        }
        this.carrying = carrying;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) throws Exception {
        if (distance < 0)
        {
            throw new Exception("Distance can't be less than 0!");
        }
        this.distance = distance;
    }

    //toString для вывода объекта
    @Override
    public String toString() {
        return "Plane{" +
                "capacity=" + capacity +
                ", carrying=" + carrying +
                ", distance=" + distance +
                '}';
    }
}
