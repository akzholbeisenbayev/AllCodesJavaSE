package BitlabAcademy.GUI.Task2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends JPanel{

    private MainFrame parent;

    private JLabel label;
    private JButton back;
    private JButton add;

    private JTextField textSurname;
    private JTextField textName;
    private JTextField textGroup;
    private JComboBox facultyBox;
    private String[] faculty = {"Information Technologies", "Economics", "Mathematics"};

    public AddPage(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);


        back = new JButton("Back");
        back.setSize(100,30);
        back.setLocation(300,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenuPage().setVisible(true);
                parent.getAddPage().setVisible(false);
            }
        });


        add = new JButton("Add");
        add.setSize(100,30);
        add.setLocation(100,400);
        add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.st[MainFrame.studentNumber] = new Student(MainFrame.studentNumber+1, textName.getText(),textSurname.getText(), (String) facultyBox.getSelectedItem(),textGroup.getText());
                MainFrame.studentNumber++; //1

                for (int i = 0; i < MainFrame.studentNumber; i++) {
                    System.out.println(MainFrame.st[i]);
                }

                textName.setText("");
                textSurname.setText("");
                textGroup.setText("");
                facultyBox.setSelectedIndex(0);
            }

        });


        label = new JLabel("Name:");
        label.setSize(50,30);
        label.setLocation(100,130);
        add(label);

        textName = new JTextField("");
        textName.setSize(200,30);
        textName.setLocation(180,130);
        add(textName);

        label = new JLabel("Surname:");
        label.setSize(70,30);
        label.setLocation(100,170);
        add(label);

        textSurname = new JTextField("");
        textSurname.setSize(200,30);
        textSurname.setLocation(180,170);
        add(textSurname);

        label = new JLabel("Faculty:");
        label.setSize(50,30);
        label.setLocation(100,210);
        add(label);

        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(200,30);
        facultyBox.setLocation(180,210);
        add(facultyBox);

        label = new JLabel("Group:");
        label.setSize(50,30);
        label.setLocation(100,250);
        add(label);

        textGroup = new JTextField("");
        textGroup.setSize(200,30);
        textGroup.setLocation(180,250);
        add(textGroup);

    }
}