package BitlabAcademy.GUI.Task2students.Aigerim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends Container {

    private MainFrame parent;

    private JLabel label;
    private JButton back;
    private JButton update;
    private String header[] = {"Name", "Surename", "Faculty","Group"};
    private JTextArea area1;

    public SecondPage(MainFrame parent) {

        this.parent = parent;
        setSize(700, 500);
        setLayout(null);
        JTextArea area1 = new JTextArea();
        area1.setSize(600, 250);
        area1.setLocation(50, 80);
        area1.setEditable(false);
        add(area1);

        label = new JLabel("LIST STUDENTS");
        label.setSize(300, 30);
        label.setLocation(50, 30);
        add(label);
        update=new JButton("Update");
        update.setSize(100, 30);
        update.setLocation(50, 400);
        add(update);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<MainFrame.studentNumber;i++) {
                    area1.append(MainFrame.students[i].toString() + "\n");
                }
            }
        });
        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(500,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}
