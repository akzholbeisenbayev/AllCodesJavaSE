package OOP.Midterm;

import java.util.ArrayList;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int sum = 0; //сколько товаров будет продано

        SmartPhone s1 = new SmartPhone(400000, "iPhone",  "A13 Bionic processor", 8, 20,12, "iPhone 11");
        SmartPhone s2 = new SmartPhone(539000, "Samsung", "Exynos 7 Quad 7578", 8, 14, 64, "Samsung Galaxy S20");
        SmartPhone s3 = new SmartPhone(300000, "Lenovo",  "Qualcomm Snapdragon 86", 12, 11,8, "Legion Phone Duel");

        Laptop l1 = new Laptop(760000, "Macbook", "Intel Core i5", 8,4,true,256,1.4, true);
        Laptop l2 = new Laptop(200000, "HP",  "Radeon", 8, 3,false,512,2.4, true);
        Laptop l3 = new Laptop(460000, "Asus",  "Intel Core i5", 8,  5,true,512, 2.243, true);



        //мало объектов, сделал акцент на реализацию рабочего меню

        System.out.println("___________________________________________________________");

        //инкапсулировал все объекты,
        // использовал ArrayList, потому что его лучше знаю, чем Map(хотя и Map идеально подходит под база данных)

        ArrayList<Device> g = new ArrayList<>();
        g.add(s1);
        g.add(s2);
        g.add(s3);
        g.add(l1);
        g.add(l2);
        g.add(l3);


        long income = 0; //прибыль


        //ниже для того, чтобы не выходить после одного раза использования.
        // Можно будет много команд делать с одной компиляции
        //логика в том, чтобы после приобретения покупок как клиент, можно было делать другие операции,
        // в том числе заходить как админ


        int rt = 1;
        //это цикл для перехода между админом и клиентом
        while (rt != 7)
        {
            System.out.println("Are you customer or admin?");
            String answer = cin.next();


            if (answer.equals("customer"))
            {
                System.out.println("Hello! Choose:");
                System.out.println("[1] Buy");
                System.out.println("[2] View all products");
                System.out.println("[3] Exit");

                int ans = 1;

                //этот цикл для операции как клиент
                while (ans != 3)
                {
                    ans = cin.nextInt();
                    if (ans == 3) break;
                    switch (ans)
                    {
                        //кейс 1 -  //можно купить товар, если его не будет в наличии или не хватит количества,
                        // то выведет соответствующее сообщение
                        case 1: {
                            System.out.println("Which product would you like to buy?");
                            System.out.print("Enter model: ");
                            String model = cin.next();
                            System.out.print("Enter price: ");
                            int price = cin.nextInt();
                            System.out.print("Enter count: ");
                            int count = cin.nextInt();

                            boolean t = true; //использовал для проверки, есть ли товар в наличии
                            boolean t1 = true;//использовал для проверки, есть ли СТОЛЬКО КОЛИЧЕСТВА товаров в наличии
                            for (Device r : g)
                            {
                                if (r.getCount() - count >= 0)
                                {
                                    t = true;
                                    t1 = true;

                                    //сделал через имя и цену, потому что так более лучше подходит под покупку как клиент
                                    if (model.equals(r.getModel()) && price == r.getPrice())
                                    {
                                        income += r.getPrice()*count; //считаем заработок
                                        r.showDetails();
                                        System.out.println("Total amount: " + (r.getPrice()*count) + " Thank you for a buy!");
                                        r.setCount(r.getCount()-count); //устанавливаем новое значение к количеству товара после покупки
                                        r.getSale(count);
                                        t = true;
                                        break;
                                    } else t = false;
                                } else {
                                    t1= false;
                                }
                            }

                            if (!t) System.out.println("We haven't got this product in stock"); //если т фолс, то "товара нет в наличии"
                            if(!t1) System.out.println("We haven't got " + count + " products in stock"); //если т1 фолс, то "столько количеств товара нет в наличии"

                            break;
                        }

                        //кейс 2 тупо выводит все товары для просмотра клиента
                        case 2: {
                            for (Device e : g)
                            {
                                e.showDetails();
                                System.out.println();
                            }
                            break;
                        }

                        case 3:
                            break;
                        default:
                        {
                            System.out.println("There is not exist that choice, select other");
                            System.out.println();
                        }
                    }
                    System.out.println("Would you like to do other actions?");
                    //отвечаем 1/2/3
                    //можем сделать много операции
                }
            }
            //админ может менять количество товаров, удалить товар из коллекции,
            // посмотреть заработок компании, посмотреть товары в наличии
            else if (answer.equals("admin")) {
                System.out.println("Hello! Choose:");
                System.out.println("[1] supplement the number of existing products");
                System.out.println("[2] delete a good");
                System.out.println("[3] income of a company");
                System.out.println("[4] goods in stock");
                System.out.println("[5] Exit");

                int ans = 1;

                //для операции как администратор
                while (ans != 5)
                {
                    ans = cin.nextInt();
                    if (ans == 5) break;
                    switch (ans)
                    {
                        //кейс 1 меняет количество товаров (то есть администратор добавляет либо отнимает товары)
                        case 1:
                        {
                            System.out.print("Enter model: ");
                            String model1 = cin.next();
                            System.out.print("Enter price: ");
                            int pr = cin.nextInt();

                            for (Device h : g) {
                                if (model1.equals(h.getModel()) && pr == h.getPrice())
                                {
                                    System.out.println("Current count: " + h.getCount());
                                    //    System.out.print("how many would .... add: ");
                                    //        int count = cin.nextInt(); //2
                                    //  h.setCount(h.getCount()+count); //устанавливаем новое значение количеству товаров
                                    System.out.print("change to: ");
                                    int t = cin.nextInt(); //5 +2 = 7
                                    h.setCount(t); //устанавливаем новое значение количеству товаров
                                }
                            }
                            break;
                        }
                        //кейс 2 удаляет товар
                        case 2: {
                            System.out.println("Enter the index (ot 0");
                            int index = cin.nextInt();
                            g.remove(index);
                            System.out.println("This good was successfully deleted!");
                            break;
                        }
                        //кейс 3 выводит заработок компании
                        case 3: {
                            System.out.println("We have earned: " + income + " tenge");
                            break;
                        }
                        //кейс 4 выводит товары в наличии
                        case 4: {
                            System.out.println("goods in stock: ");

                            for (Device e : g)
                            {
                                if(e.getCount()!=0) {
                                    e.showDetails();
                                    System.out.println();
                                }
                            }
                            break;
                        }
                        case 5:
                            break;
                        default: {
                            System.out.println("There is not exist that choice, select other");
                        }
                        System.out.println("Would you like to do other actions?");
                    }

                }
            }
            //чтобы продолжить еще работы:
            System.out.println("Press 1 to continue or Press 7 to exit: ");
            rt = cin.nextInt();

        }
    }
}

