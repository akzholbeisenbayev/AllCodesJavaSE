package com.company.Airline;


//Создаем Абстрактный класс
public class Fighter extends Plane{
    //Создаем атрибуты
    private int quantity;
    private int affected__area;

    //Конструктор по умолчанию
    public Fighter() {
    }

    //Конструктор со значениями
    public Fighter(String type, int weight, int capacity, int carrying, int distance, int quantity, int affected__area) {
        super(type, weight, capacity, carrying, distance);
        this.quantity = quantity;
        this.affected__area = affected__area;
    }

    //Метод для вывода информации о самолете
    public void showDetalis(){
        System.out.println("Fighter Plane:");
        System.out.println("Type: " + super.getType() + "\nWeight: " + super.getWeight() + " ton\nCapacity: " + super.getCapacity() + "\nCarrying: " + super.getCarrying() + "\nDistance: " + super.getDistance() + " km\nQuantity of Rockets: " + quantity + "\nThe affected area: " + affected__area + " metre\n");
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

    public int getAffected__area() {
        return affected__area;
    }

    public void setAffected__area(int affected__area) throws Exception {
        if (affected__area < 0)
        {
            throw new Exception("Affectec area can't be less than 0!");
        }
        this.affected__area = affected__area;
    }


    //toString для вывода объекта
    @Override
    public String toString() {
        return "Fighter{" +
                "quantity=" + quantity +
                ", affected__area=" + affected__area +
                '}';
    }
}
