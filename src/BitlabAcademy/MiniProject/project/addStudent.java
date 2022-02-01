package BitlabAcademy.MiniProject.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addStudent extends JPanel {
    private MainFrame parent;
    private JLabel label;
    private JButton addbutton, backbutton;
    private JTextField textField1, textField2;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[100];

    public addStudent(MainFrame parent){
        this.parent=parent;
        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }
        setSize(500,500);
        setLayout(null);

        label = new JLabel("NAME");
        label.setSize(300,30);
        label.setLocation(50,100);
        add(label);

        label = new JLabel("SURNAME");
        label.setSize(300,30);
        label.setLocation(50,150);
        add(label);


        label = new JLabel("AGE");
        label.setSize(300,30);
        label.setLocation(50,250);
        add(label);

        textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(130,100);
        add(textField1);

        textField2 = new JTextField();
        textField2.setSize(300,30);
        textField2.setLocation(130,150);
        add(textField2);

        agesBox = new JComboBox(ages);
        agesBox.setSize(300,30);
        agesBox.setLocation(130,250);
        add(agesBox);
        DBManager db = new DBManager();
        db.connect();
        addbutton = new JButton("ADD");
        addbutton.setSize(150,30);
        addbutton.setLocation(50,300);
        add(addbutton);
        addbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Students student = new Students(null, textField1, textField2, agesBox);
                db.addStudent(student);
                if(!textField1.equals("")&& !textField2.equals("") ){
                    textField1.setText("");
                    textField2.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });
        backbutton = new JButton("BACK");
        backbutton.setSize(150,30);
        backbutton.setLocation(250,300);
        add(backbutton);
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getAddPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}