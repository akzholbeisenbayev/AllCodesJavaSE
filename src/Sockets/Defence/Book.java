package Sockets.Defence;

import java.io.Serializable;

public class Book implements Serializable
{
    private int id;
    private String name;
    private String author;

    public Book(){}

    public Book(int id, String name, String author)
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
        {
            throw new Exception("Id can't be less than 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null)
        {
            throw new Exception("Name is null");
        }
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author == null)
        {
            throw new Exception("Author is null");
        }
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

