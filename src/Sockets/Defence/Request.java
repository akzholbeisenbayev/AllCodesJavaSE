package Sockets.Defence;

import OOP.Task1.Rentals;

import java.io.Serializable;
import java.util.ArrayList;


public class Request implements Serializable,Cloneable
{
    private String operationType;
    private ArrayList<Book> books;

    public Request(String operationType, ArrayList<Book> books) {
        this.operationType = operationType;
        this.books = books;
    }

    public Request(String operationType)
    {
        this.operationType = operationType;
    }
    public Request(ArrayList<Book> books)
    {
        this.books = books;
    }


    @Override
    protected Request clone() throws CloneNotSupportedException {
        return (Request)super.clone();
    }

    public void addBook(Book b)
    {
        books.add(b);
    }


    @Override
    public String toString() {
        return "Request{" +
                "operationType='" + operationType + '\'' +
                ", books=" + books +
                '}';
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) throws Exception {
        if (operationType == null)
        {
            throw new Exception("Name is null");
        }
        this.operationType = operationType;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
