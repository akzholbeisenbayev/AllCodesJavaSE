package BitlabAcademy.TryCatch.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Book book1 = new Book(1, "ads", "dasf");
        Book book2 = new Book(2, "fas", "dfafasf");
        Book book3 = new Book(3, "adfasfasfs", "dasasf");


        Library library = new Library("Library", "Almaty");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book3);

        library.printBooks();

    }
}
