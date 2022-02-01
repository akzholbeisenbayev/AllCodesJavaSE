package BitlabAcademy.MiniProject.project;

import javax.swing.*;

public class Students {
    public Long id;
    private String name;
    private String surname;
    public int age;

    public Students(Long id, JTextField textField1, JTextField textField2, JComboBox agesBox){}
    public Students(Long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String toString(){
        return getId() + ", " + getName() + ", " + getSurname() + ", " + getAge();
    }
}