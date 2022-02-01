package BitlabAcademy.MiniProject.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class listStudents extends JPanel {
    private MainFrame parent;
    private JLabel label;
    private JButton back, update;
    private String header[] = {"Id","Name","Surname", "age"};
    private JTextArea area;
    private JScrollPane scrollPane;
    public listStudents (MainFrame parent){
        this.parent = parent;
        setSize(500,500);
        setLayout(null);
        label = new JLabel("LIST STUDENTS");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);
        DBManager db = new DBManager();
        db.connect();
        update = new JButton("Update");
        update.setSize(300, 30);
        update.setLocation(100, 400);
        add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Students>students =db.getAllStudents();
                for(Students s: students){
                    System.out.println(s);
                }
                area.append(PackageData.getPD(students));
            }
        });
        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(100,350);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                parent.getListStudentPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });


        area = new JTextArea();
        area.setSize(300,200);
        area.setLocation(100,150);
        add(area);
    }

}