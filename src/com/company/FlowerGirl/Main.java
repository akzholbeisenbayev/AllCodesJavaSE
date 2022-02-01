package com.company.FlowerGirl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

//1.	Цветочница.
// Определить иерархию цветов.
// Создать несколько объектов-цветов.
// Собрать букет с определением его стоимости.
// Провести сортировку цветов в заказе на основе одного из параметров.
// Найти цветы в букете, соответствующие заданному диапазону параметров.
public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Flower> bouquet = new ArrayList<>(); //букет цветов

        //объекты цветов
       Clove clove = new Clove("Carnation", 300, 1.4,"yellow");
        bouquet.add(clove);//добавляем в букет

        //объекты цветов
       Rosaceae rosaceae = new Rosaceae("Rose", 600, 1.5, "red");
        bouquet.add(rosaceae);//добавляем в букет

        //объекты цветов
       Astrovye astrovye1 = new Astrovye("Gerbera", 200, 0.4, "yellow");
       Astrovye astrovye2 = new Astrovye("Aster",  600, 0.5, "pink");
       Astrovye astrovye3 = new Astrovye("Chrysanthemum",1000, 0.3,"Pink");
        bouquet.add(astrovye1);//добавляем в букет
        bouquet.add(astrovye2);//добавляем в букет
        bouquet.add(astrovye3);//добавляем в букет

        //объекты цветов
       Lily lily1 = new Lily("Lily", 450, 0.24, "white");
       Lily lily2 = new Lily("Tulip", 550, 0.78, "red");
        bouquet.add(lily1);//добавляем в букет
        bouquet.add(lily2);//добавляем в букет


        while(true)
        {
            //Выводим меню
            System.out.println("PRESS [1] to Show the total price of the Bouquet");
            System.out.println("PRESS [2] to Sort the flowers by price");
            System.out.println("PRESS [3] to Find the flowers in Bouquet by the specified parameter(price)");
            System.out.println("PRESS [4] to Exit");
            //Вводим наш выбор
            int choice = Integer.parseInt(reader.readLine());

            //Посчитать стоимость аммуниций
            if(choice == 1)
            {
                //Для хранения значении стоимости
                int total = 0;

                for (Flower i: bouquet)
                {
                    total += i.getPrice();
                }

                System.out.println("Total price of the Bouquet: " + total);
                System.out.println();

                //Обнуляем переменные
                total = 0;
            }

            //Выводим отсортированный ЭррейЛист по значению цены
            else if(choice == 2)
            {
                //Сортируем используя функцию sort ArrayList-а
                bouquet.sort(Comparator.comparingInt(Flower::getPrice));
                System.out.println("Sorted flowers by price::");
                System.out.println();

                //Выводим отсортированный ЭррейЛист
                for (Flower i: bouquet)
                {
                    System.out.println(i.toString() + " ");
                }
                System.out.println();
            }

            //Находим амуниции, соответствующие заданному диапазону параметров.
            else if(choice == 3)
            {
                //Выбираем вид поиска
                System.out.println("Find the flowers by price:");

                //Вводим желаемое значение
                System.out.print("Input cost: ");
                int cost = Integer.parseInt(reader.readLine());

                //Создаем перемменную для проверки найденности объектов
                boolean b = false;

                //Если аммуниция найдена, то выводим на экран
                for (Flower i: bouquet)
                {
                    if(i.getPrice() == cost)
                    {
                        System.out.println(i.toString());
                        b = true;
                    }
                }

                //Если цветок не найден, то выводим, что он не найден
                if(!b)
                {
                    System.out.println("We don't have flower with that price!");
                    System.out.println();
                }
            }
            //Завершаем программу
            else
            {
                System.out.println("Thank you! Good bye! Have a nice day! :)");
                break;
            }
        }
    }
}
