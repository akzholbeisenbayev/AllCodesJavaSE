package BitlabAcademy.OOP.AbstractClasses.Task4;

public class Teacher extends User
{
    private String nickName;
    private String status; //// например: Professor, Lecturer, Tutor, Assistant.
    private String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    private int sizeOfSubjects = 0;


    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public Teacher(){}

    @Override
    public String getUserData() {
        return getId() + ", " + getLogin()+", "+ getPassword()+ ", "+ getNickName() + ", "+ getStatus();
    }

    void addSubject(String subject)
    {
        subjects[sizeOfSubjects] = subject; //Math, Physics, Music;
        sizeOfSubjects++; //+3 = 3
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
        String[] subj = new String[sizeOfSubjects];

        for(int i=0; i<sizeOfSubjects; i++) {
            subj[i] = subjects[i];
        }
        return subj;
    }

//Math, Physics, null, null, null


    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }
}
