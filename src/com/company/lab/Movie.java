package com.company.lab;

public class Movie {
    private int id;
    private String name;
    private String date;
    private String country;

    public Movie(int id, String name, String date, String country) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
        {
            throw new Exception("Id can't be less than 0!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name == null)
        {
            throw new Exception("Name can't be empty!");
        }
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) throws Exception {
        if(date == null)
        {
            throw new Exception("Date can't be empty!");
        }
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) throws Exception {
        if(country == null)
        {
            throw new Exception("Country can't be empty!");
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}



