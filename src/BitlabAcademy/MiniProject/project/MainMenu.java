package BitlabAcademy.MiniProject.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private MainFrame parent;
    private JButton addStudentButton;
    private JButton listStudentButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {
        this.parent = parent;
        setSize(500,500);
        setLayout(null);
        addStudentButton = new JButton("ADD STUDENT");
        addStudentButton.setSize(300,30);
        addStudentButton.setLocation(100,100);
        add(addStudentButton);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getAddPage().setVisible(true);
            }
        });
        listStudentButton = new JButton("LIST STUDENTS");
        listStudentButton.setSize(300,30);
        listStudentButton.setLocation(100,150);
        add(listStudentButton);
        listStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getListStudentPage().setVisible(true);
            }
        });
        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}