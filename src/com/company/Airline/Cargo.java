package com.company.Airline;


//Создаем Абстрактный класс
public class Cargo extends Plane{
    //Создаем атрибуты
    private int quantity;

    //Конструктор по умолчанию
    public Cargo() {
    }

    //Конструктор со значениями
    public Cargo(String type, int weight, int capacity, int carrying, int distance, int quantity) {
        super(type, weight, capacity, carrying, distance);
        this.quantity = quantity;
    }

    //Метод для вывода информации о самолете
    public void showDetalis(){
        System.out.println("Cargo Plane:");
        System.out.println("Type: " + super.getType() + "\nWeight: " + super.getWeight() + " ton\nCapacity: " + super.getCapacity() + "\nCarrying: " + super.getCarrying() + "\nDistance: " + super.getDistance()  + " km\nQuantity of Cargo: " + quantity + "\n");
    }


    //Геттеры и Сеттеры
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws Exception {
        if (quantity < 0)
        {
            throw new Exception("Quantity can't be less than 0!");
        }
        this.quantity = quantity;
    }


    //toString для вывода объекта
    @Override
    public String toString() {
        return "Cargo{" +
                "quantity=" + quantity +
                '}';
    }
}
