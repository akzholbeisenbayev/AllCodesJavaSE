package BitlabAcademy.MiniProject.project;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private addStudent addPage;
    private listStudents listPage;
    //public static Students[]students=new Students[10];
    public static int studNumber=0;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENTS APPLICATION");
        setSize(500,500);
        setLayout(null);
        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addPage = new addStudent(this);
        addPage.setVisible(false);
        add(addPage);

        listPage = new listStudents(this);
        listPage.setVisible(false);
        add(listPage);
    }
    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public addStudent getAddPage() {
        return addPage;
    }

    public listStudents getListStudentPage() {
        return listPage;
    }

}