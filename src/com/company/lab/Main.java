package com.company.lab;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/videoteka?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String password ="";


    public static void main(String[] args) throws InputMismatchException
    {
        Scanner cin = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection");

            while (true)
            {
                System.out.println("[1] Найти все фильмы вышедшие в текущем и прошлом году");
                System.out.println("[2] Вывести информацию об актерах, снимавшихся в заданном фильме");
                System.out.println("[3] Вывести информацию об актерах, снимавшиехся как минимум в N ильмах");
                System.out.println("[4] Показать актеров которые были режиссерами хотя бы одного из фильмов");
                System.out.println("[5] Удалить все фильмы дата выхода которых была более заданного лет назад");
                System.out.println("[0] Выход");
                int menu = cin.nextInt();
                if(menu == 1)
                {
                    ArrayList<Movie> movies = showNewMovies();
                    for (int i =0;i<movies.size();i++)
                    {
                        System.out.println(movies.get(i).toString());
                    }

                }
                else if(menu == 2)
                {
                    System.out.println("Введите название фильма");
                    String movieName = cin.next();
                    ArrayList<Actor> actors = showActorByMovie(movieName);
                    for (int i=0;i<actors.size();i++)
                    {
                        System.out.println(actors.get(i).toString());
                    }
                }
                else if(menu == 3)
                {
                    System.out.println("Введите N");
                    int n = cin.nextInt();
                    ArrayList<Actor> actors = whoActedInNMovies(n);
                    for (int i=0;i<actors.size();i++)
                    {
                        System.out.println(actors.get(i).toString());
                    }
                }
                else if(menu == 4)
                {
                    ArrayList<Actor>actors = showActorsWhoIsDirector();
                    for (int i=0;i<actors.size();i++)
                    {
                        System.out.println(actors.get(i).toString());
                    }

                }
                else if(menu == 5)
                {
                    System.out.println("Введите лет");
                    int n = cin.nextInt();
                    deleteMovie(n);

                }
                else if(menu == 0)
                {
                    break;
                }
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private static ArrayList<Movie> showNewMovies()
    {
        ArrayList<Movie> movies = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query ="select * from films where release_date between 2019 and 2020";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                int id = resultSet.getInt("film_id");
                String name = resultSet.getString("film_name");
                String release_date = resultSet.getString("release_date");
                String country = resultSet.getString("country");
                movies.add(new Movie(id,name,release_date,country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return movies;
    }
    private static int findIdOfMovie(String movieName)
    {
        int id=0;
        String n = "'" +movieName+ "'";
        try {
            Statement statement = connection.createStatement();
            String query ="select film_id from films where film_name ="+n;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                id = resultSet.getInt("film_id");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return id;
    }
    private static ArrayList<Actor> showActorByMovie(String movieName)
    {
        ArrayList<Actor> actors = new ArrayList<>();
        int idOfMovie = findIdOfMovie(movieName);
        String n = "'" +movieName+ "'";
        try {
            Statement statement = connection.createStatement();
            String query ="select * from videoteka.actors\n" +
                    "where actor_id IN(select actor_id from videoteka.movieactor where film_id IN(SELECT film_id from videoteka.films where film_name = "+n +"))";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                int id = resultSet.getInt("actor_id");
                String lname = resultSet.getString("lname");
                String fname = resultSet.getString("fname");
                actors.add(new Actor(id,lname,fname));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return actors;
    }
    private static ArrayList<Actor> whoActedInNMovies(int n)
    {
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query ="select * from actors where actor_id IN(select actor_id from movieactor GROUP BY actor_id HAVING COUNT(actor_id)>="+n+")";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                int id = resultSet.getInt("actor_id");
                String lname = resultSet.getString("lname");
                String fname = resultSet.getString("fname");
                actors.add(new Actor(id,lname,fname));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return actors;
    }
    private static ArrayList<Actor> showActorsWhoIsDirector()
    {
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query ="select * from actors, directors where actors.lname = directors.lname and actors.fname = directors.fname";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                int id = resultSet.getInt("actor_id");
                String lname = resultSet.getString("lname");
                String fname = resultSet.getString("fname");
                actors.add(new Actor(id,lname,fname));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return actors;
    }
    private static void deleteMovie(int year)
    {
        try {
            int n = 2020-year;
            Statement statement = connection.createStatement();
            String query = "delete from films where release_date <"+n;
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
