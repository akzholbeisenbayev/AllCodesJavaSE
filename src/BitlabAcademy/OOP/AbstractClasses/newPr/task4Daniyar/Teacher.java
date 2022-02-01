package BitlabAcademy.OOP.AbstractClasses.newPr.task4Daniyar;

public class Teacher extends User{
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher(){

    }

    public Teacher(int id, String login, String password,String nickName,String status){
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }
    @Override
    public String getUserData(){
        return getLogin()+" "+getPassword()+" "+nickName+" "+status;
    }
}
