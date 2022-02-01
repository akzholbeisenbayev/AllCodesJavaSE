package BitlabAcademy.GUI.Task2students.Aigerim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends Container {
    private JButton button;

    private MainFrame parent;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox facultyBox;
    private JTextArea area1;


    private String[]faculty=new String[]{"Information Technologies","Economics","Mathematics"};

    private JLabel label;
    private JButton back;
    private JButton add;

    public FirstPage(MainFrame parent) {
        this.parent = parent;
        setSize(700,500);
        setLayout(null);

        label = new JLabel("NAME:");
        label.setSize(200,30);
        label.setLocation(100,50);
        add(label);

        textField1 = new JTextField();
        textField1.setSize(350,30);
        textField1.setLocation(200,50);
        add(textField1);

        label = new JLabel("SURNAME:");
        label.setSize(200,30);
        label.setLocation(100,100);
        add(label);
        textField2 = new JTextField("");
        textField2.setSize(350,30);
        textField2.setLocation(200,100);
        add(textField2);

        label = new JLabel("GROUP:");
        label.setSize(200,30);
        label.setLocation(100,200);
        add(label);

        textField3 = new JTextField("");
        textField3.setSize(350,30);
        textField3.setLocation(200,200);
        add(textField3);

        label = new JLabel("FACULTY:");
        label.setSize(200,30);
        label.setLocation(100,150);
        add(label);

        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(300,30);
        facultyBox.setLocation(200,150);
        add(facultyBox);

        add = new JButton("ADD");
        add.setSize(100,30);
        add.setLocation(150,300);
        add(add);


        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                MainFrame.students[MainFrame.studentNumber]=new Students(MainFrame.studentNumber+1,textField1.getText(), textField2.getText(),(String)facultyBox.getSelectedItem(), textField3.getText());
                MainFrame.studentNumber++;

                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                facultyBox.setSelectedIndex(0);
            }
        });


        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(400,300);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}