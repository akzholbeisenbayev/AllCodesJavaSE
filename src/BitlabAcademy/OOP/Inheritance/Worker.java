package BitlabAcademy.OOP.Inheritance;

public class Worker extends People
{
    int salary;
    String job_name;

    public Worker(String name, String surname, int salary, String job_name) {
        super(name, surname);
        this.salary = salary;
        this.job_name = job_name;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(salary);
        System.out.println(job_name);
    }


}
