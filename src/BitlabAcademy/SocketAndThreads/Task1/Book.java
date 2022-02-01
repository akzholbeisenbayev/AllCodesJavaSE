package BitlabAcademy.SocketAndThreads.Task1;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String name;
    private String author;

    public Book(){}

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}