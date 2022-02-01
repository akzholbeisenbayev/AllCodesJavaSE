package com.company.Knight;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;


//Рыцарь.
// Определить иерархию амуниции рыцаря.
// Экипировать рыцаря.
// Посчитать стоимость.
// Провести сортировку амуниции на основе одного из параметров.
// Найти элементы амуниции, соответствующие заданному диапазону параметров.

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Ammunition> ammunition = new ArrayList<>();

        Armor a = new Armor(2000, "M", 20000, 1.8);
        ammunition.add(a);
        Helm h = new Helm(600, "M", 4850, 0.572);
        ammunition.add(h);
        Shield s = new Shield(100, "M", 3530, 1.03);
        ammunition.add(s);
        Sword sw = new Sword(2345, 650, 6350, 1.27);
        ammunition.add(sw);
        Knight knight = new Knight("Amir", 19,  ammunition);


        while(true)
        {
            //Выводим меню
            System.out.println("PRESS [1] to Show the total price");
            System.out.println("PRESS [2] to Sort the ammunition by price");
            System.out.println("PRESS [3] to Find the ammunition by the specified parameter(price)");
            System.out.println("PRESS [4] to Exit");
            //Вводим наш выбор
            int choice = Integer.parseInt(reader.readLine());

            //Посчитать стоимость аммуниций
            if(choice == 1)
            {
                //Для хранения значении стоимости
                int total = 0;

                    for (Ammunition i: ammunition)
                    {
                            total += i.getCost();
                    }

                System.out.println("Total price for Knight's ammunition: " + total);
                System.out.println();

                //Обнуляем переменные
                total = 0;
            }

            //Выводим отсортированный ЭррейЛист по значению цены
            else if(choice == 2)
            {
                //Сортируем используя функцию sort ArrayList-а
                ammunition.sort(Comparator.comparingInt(Ammunition::getCost));
                System.out.println("Sorted ammunition by cost:");
                System.out.println();

                //Выводим отсортированный ЭррейЛист
                for (Ammunition i: ammunition)
                {
                    System.out.println(i.toString() + " ");
                }
                System.out.println();
            }

            //Находим амуниции, соответствующие заданному диапазону параметров.
            else if(choice == 3)
            {
                //Выбираем вид поиска
                System.out.println("Find the ammunition by cost");

                    //Вводим желаемое значение
                    System.out.print("Input cost: ");
                    int cost = Integer.parseInt(reader.readLine());

                    //Создаем перемменную для проверки найденности объектов
                    boolean b = false;

                    //Если аммуниция найдена, то выводим на экран
                    for (Ammunition i: ammunition)
                    {
                        if(i.getCost() == cost)
                        {
                            System.out.println(i.toString());
                            b = true;
                        }
                    }

                    //Если аммуниция не найдена, то выводим, что она не найдена
                    if(!b)
                    {
                        System.out.println("We don't have ammunition with that price!");
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
