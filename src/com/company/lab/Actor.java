package com.company.lab;


public class Actor
{
    private int id;
    private String lastname;
    private String firstname;

    public Actor(int id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
        {
            throw new Exception("Id can't be less than 0!");
        }
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) throws Exception {
        if(lastname == null)
        {
            throw new Exception("Last name can't be empty!");
        }
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) throws Exception {
        if(firstname == null)
        {
            throw new Exception("First name can't be empty!");
        }
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
