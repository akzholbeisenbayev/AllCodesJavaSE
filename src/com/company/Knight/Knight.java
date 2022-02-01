package com.company.Knight;

import java.util.ArrayList;

public class Knight{

    private String name;
    private int age;
    private ArrayList<Ammunition> ammunitions;

    //конструктор
    public Knight( String name, int age, ArrayList<Ammunition> ammunitions)
    {
        this.name = name;
        this.age = age;
        this.ammunitions = ammunitions;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return "Knight{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", ammunitions = " + ammunitions + " " + super.toString();
    }

    //сеттеры
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Name is null!");
        }
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age can't be less than 0!");
        }
        this.age = age;
    }

    public void setAmmunition(ArrayList<Ammunition> ammunitions) throws Exception {
        if (ammunitions == null) {
            throw new Exception("Ammunition is null!");
        }
        this.ammunitions = ammunitions;
    }

    //геттеры
    public ArrayList<Ammunition> getAmmunition() {
        return ammunitions;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
