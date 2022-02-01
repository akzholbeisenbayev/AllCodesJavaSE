package com.company;

import java.io.Serializable;

public class Student implements Serializable
{
    private int id;
    private String name;
    private String surname;
    private int age;

    public Student(int id, String name, String surname, int age)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception
    {
        if(id < 0)
        {
            throw new Exception("Id can't be less than 0!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception
    {
        if(name == null)
        {
            throw new Exception("Name can't be empty!");
        }
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname) throws Exception
    {
        if(surname == null)
        {
            throw new Exception("Surname can't be empty!");
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception
    {
        if(age < 0)
        {
            throw new Exception("Age can't be less than 0!");
        }
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
