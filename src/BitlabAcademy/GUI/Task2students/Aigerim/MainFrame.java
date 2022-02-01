package BitlabAcademy.GUI.Task2students.Aigerim;

import javax.swing.*;
public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private FirstPage firstPage;
    private SecondPage secondPage;
    public static Students[] students = new Students[10];
    public static int studentNumber=0;

    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT APPLICATION");
        setSize(700,500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;

    }


    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }
}