package BitlabAcademy.TryCatch.Task1;


public class User{
    public String name;
    public String surname;
    public int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getData(){
        System.out.println(name + " " + surname + " " + age);
    }
}
//
//public class User{
//
//    String name;
//    String surname;
//    int age;
//
//    public User(){}
//    public User(String name,String surname,int age){
//        this.name=name;
//        this.surname=surname;
//        this.age=age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
