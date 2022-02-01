package BitlabAcademy.SocketAndThreads.task1Students;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class PackageData implements Serializable {
    private String operationType;
    private ArrayList<Book> books;
    private Book book;

    public PackageData(String operationType, Book book) {
        this.operationType = operationType;
        this.book = book;
    }

    public PackageData(String operationType, ArrayList<Book> books, Book book) {
        this.operationType = operationType;
        this.books = books;
        this.book = book;
    }

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(Book book) {
        this.book = book;
    }

    public PackageData(ArrayList<Book> books) {
        this.books = books;
    }

    public String getOperationType() {
        return operationType;
    }


    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) books.clone();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
