package com.company.Airline;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
        //Создаем Главный ЭррейЛист для хранения всех самолетов
        //Это наша Авиакомпания
        ArrayList<Plane> airline = new ArrayList<>();
        //Сканер
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //Добавляем в ЭррейЛист объекты
        airline.add(new Cargo("Cargo Plane", 15,3000, 12000, 9000, 1500));
        airline.add(new Passenger("Passenger Plane", 10,4000, 9000, 7000, 500, 4));
        airline.add(new Fighter("Fighter Plane", 11,5000, 15000, 8000, 30, 10));


        //Меню
        while(true){
            //Вывовдим меню
            System.out.println("1. Show total capacity and carrying");
            System.out.println("2. Sort the aircraft for flight distance");
            System.out.println("3. Find the plane by the specified parameter");
            System.out.println("4. Exit");
            //Вводим наш выбор
            int choice = Integer.parseInt(reader.readLine());

            //Показываем общую вместимость и перевозку для каждого вида самолетов
            if(choice == 1){
                //Для хранения значении
                int total__capacity = 0;
                int total__carrying = 0;


                //Грузовые самолеты
                for (Plane i: airline){
                    if(i.getType().equals("Cargo Plane")) {
                        total__capacity += i.getCapacity();
                        total__carrying += i.getCarrying();
                    }
                }
                //Выводим общие значения для грузовых самолетов
                System.out.println("Cargo Plane:");
                System.out.println("Total capacity: " + total__capacity);
                System.out.println("Total carrying: " + total__carrying);
                System.out.println();
                //Обнуляем переменные
                total__capacity = 0;
                total__carrying = 0;

                //Пассажирские самолеты
                for (Plane i: airline){
                    if(i.getType().equals("Passenger Plane")) {
                        total__capacity += i.getCapacity();
                        total__carrying += i.getCarrying();
                    }
                }
                //Выводим общие значения для пассажирских самолетов
                System.out.println("Passenger Plane:");
                System.out.println("Total capacity: " + total__capacity);
                System.out.println("Total carrying: " + total__carrying);
                System.out.println();
                //Обнуляем переменные
                total__capacity = 0;
                total__carrying = 0;

                //Боевые самолеты(Истребители)
                for (Plane i: airline){
                    if(i.getType().equals("Fighter Plane")) {
                        total__capacity += i.getCapacity();
                        total__carrying += i.getCarrying();
                    }
                }
                //Выводим общие значения для боевых самолетов
                System.out.println("Fighter Plane:");
                System.out.println("Total capacity: " + total__capacity);
                System.out.println("Total carrying: " + total__carrying);
                System.out.println();

            }
            //Выводим отсортированный ЭррейЛист по значению дистанции
            else if(choice == 2){
                //Сортируем
                airline.sort(Comparator.comparingInt(Plane::getDistance));
                System.out.println("Sorted planes by Distance:");

                //Выводим отсортированный Лист и их тип
                for (Plane i: airline){
                    System.out.println(i.getType() + " " + i.getDistance());
                }
                System.out.println();
            }

            //Находим самолеты которые подходит под выбранные значение
            else if(choice == 3){
                //Выбираем вид поиска
                System.out.println("\n1. Total capacity");
                System.out.println("2. Total carrying");
                System.out.println("3. Flight distance");
                System.out.println("4. Exit");

                //Выбираем
                choice = Integer.parseInt(reader.readLine());

                //По вместимости
                if(choice == 1){
                    //Вводим желаемое значение
                    System.out.println("Input capacity: ");
                    int capacity = Integer.parseInt(reader.readLine());

                    //Создаем перемменную для проверки найденности объектов
                    boolean b = false;

                    //Если самолет найден, то выводим на экран
                    for (Plane i: airline){
                        if(i.getCapacity() == capacity){
                            i.showDetalis();
                            b = true;
                        }
                    }

                    //Если самолет не найден, то выводим, что он не найден
                    if(b == false){
                        System.out.println("Not found!\n");
                    }
                }
                //По перевозке
                else if(choice == 2){
                    //Вводим желаемое значение
                    System.out.println("Input carrying: ");
                    int carrying = Integer.parseInt(reader.readLine());

                    //Создаем перемменную для проверки найденности объектов
                    boolean b = false;

                    //Если самолет найден, то выводим на экран
                    for (Plane i: airline){
                        if(i.getCarrying() == carrying){
                            i.showDetalis();
                            b = true;
                        }
                    }

                    //Если самолет не найден, то выводим, что он не найден
                    if(b == false){
                        System.out.println("Not found!\n");
                    }
                }
                // По дистанции
                else if(choice == 3){
                    //Вводим желаемое значение
                    System.out.println("Input flight distance: ");
                    int distance = Integer.parseInt(reader.readLine());

                    //Создаем перемменную для проверки найденности объектов
                    boolean b = false;

                    //Если самолет найден, то выводим на экран
                    for (Plane i: airline){
                        if(i.getDistance() == distance){
                            i.showDetalis();
                            b = true;
                        }
                    }

                    //Если самолет не найден, то выводим, что он не найден
                    if(b == false){
                        System.out.println("Not found!\n");
                    }

                }

            }
            //Завершаем программу
            else{
                break;
            }

        }
    }
}


