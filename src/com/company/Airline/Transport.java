package com.company.Airline;

//Создаем Абстрактный класс
public abstract class Transport {
    //Создаем атрибуты
    private String type;
    private int weight;

    //Конструктор по умолчанию
    public Transport() {
    }

    //Конструктор со значениями
    public Transport(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    //Геттеры и Сеттеры
    public String getType() {
        return type;
    }

    public void setType(String type) throws Exception {
        if (type == null) {
            throw new Exception("Type is null!");
        }
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws Exception {
        if (weight < 0)
        {
            throw new Exception("Weight can't be less than 0!");
        }
        this.weight = weight;
    }

}
