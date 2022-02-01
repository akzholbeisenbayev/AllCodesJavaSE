package BitlabAcademy.OOP.Inheritance.task6;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    Staff(){}
    Staff(String login, String password, String name, String surname, double salary){
        super(login, password, name, surname);
        this.salary = salary;
    }
    public void setSalary( double salary){
        this.salary = salary;
    }
    public double getSalary(){return salary;}

    public int getIndexOfSubject(){return indexOfSubject;}


    public void addSubjects(String subject){
        this.subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
    public String getSubjects(){
        String s = "";
        for(int i=0; i<indexOfSubject;i++){
            s+= subjects[i]+",";
        }
        return s;
    }

    @Override
    public void getData(){
        super.getData();
        System.out.println(" " + getSurname()+" "+getSalary()+" "+getSubjects());
    }
}

