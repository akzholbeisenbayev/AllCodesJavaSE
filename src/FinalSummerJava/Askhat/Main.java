package FinalSummerJava.Askhat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Askhat", "Akshat19072021");

        Book book1  = new Book("TheSubtleArtOfIndifference", "SelfDevelopment", "MarkManson", 3500, 24);
        Book book2  = new Book("NiSi", "SelfDevelopment", "DzhenSinsero", 4550, 20);
        Book book3  = new Book("None", "SelfDevelopment", "DzhenSinsero", 3700,31);
        Book book4  = new Book("DontCry", "SelfDevelopment", "DzhenSinsero", 2750, 45);
        Book book5  = new Book("DontBeStupid", "SelfDevelopment", "DzhenSinsero", 4500,21);
        ArrayList<Book> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Basket> baskets = new ArrayList<>();


        while(true)
        {
            System.out.println("Clients choose [1]");
            System.out.println("Admin choose   [2]");
            System.out.println("to EXIT choose [0]");

            int ch = 7;
            ch = scanner.nextInt();

            switch (ch)
            {
                case 0: break;
                case 1:
                {
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print(name + ", your money: ");
                    int money = scanner.nextInt();
                    Client client = new Client(name, money);
                    clients.add(client);

                    System.out.println();
                    System.out.println("Library: ");
                    for (int i = 0; i < library.size(); i++)
                    {
                        System.out.println(library.get(i).toString());
                    }
                    System.out.println();

                    int choice = 3;
                    int total = 0;
                    while (choice != 0) {
                        System.out.println("[1] to continue");
                        System.out.println("[0] to EXIT");
                        choice = scanner.nextInt();
                        if (choice == 0) break;

                        System.out.print("Name of the book, that you want to buy: ");
                        String nameBook = scanner.next();
                        System.out.print("Author of the book: ");
                        String authorBook = scanner.next();
                        System.out.print("How many books do you want to buy: ");
                        int numberBook = scanner.nextInt();

                        for (int i = 0; i < library.size(); i++)
                        {
                            int money2 = money;
                            if (library.get(i).getName().equals(nameBook) && library.get(i).getAuthor().equals(authorBook) && library.get(i).getQuantity() > numberBook) {
                                Basket basket = new Basket(library.get(i).getName(), library.get(i).getAuthor(), library.get(i).getPrice() * numberBook, numberBook);
                                basket.setTotal(basket.getBookPrice());
                                total += basket.getTotal();
                                money2 -= total;
                                if (money2 < 0) {
                                    System.out.println("You don't have enough money!");
                                    break;
                                }
                                baskets.add(basket);
                                money -= money2;
                            }
                        }
                        if (money > 0) System.out.println("Your total basket: " + total);
                    }
                }
                case 2:
                    {
                    System.out.print("Name: ");
                    String adminsName = scanner.next();
                    System.out.print("Password: ");
                    String adminsPassword = scanner.next();
                    if (admin.getName().equals(adminsName) && admin.getPassword().equals(adminsPassword)) {
                        int sumClients = 0;
                        for (int i = 0; i < clients.size(); i++) {
                            sumClients++;
                        }
                        System.out.println("Clients number: " + sumClients);

                        int sumofBooks = 0;
                        for (int i = 0; i < library.size(); i++) {
                            sumofBooks += library.get(i).getQuantity();
                        }
                        System.out.println("Number of books in our library: " + sumofBooks);

                        int sumOfSoldBooks = 0;
                        for (int i = 0; i < baskets.size(); i++) {
                            sumOfSoldBooks += baskets.get(i).getBookQuantity();
                        }
                        System.out.println("Sold books: " + sumOfSoldBooks);

                        int sumOfProfit = 0;
                        for (int i = 0; i < baskets.size(); i++) {
                            sumOfProfit += baskets.get(i).getBookPrice();
                        }
                        System.out.println("Total profit: " + sumOfProfit);
                    } else {
                        System.out.println("Input data is not correct :(");
                    }
                }
                default:
                    System.out.println("There is no that choise!");
            }
        }
    }
}
