package BitlabAcademy.GUI.Task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPage extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JButton back;
    private JTextArea textArea;
    private JButton update;
    public ListPage(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("List All Students");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        textArea = new JTextArea();
        textArea.setSize(1000, 200);
        textArea.setLocation(30, 130);
        add(textArea);



        update = new JButton("Update");
        update.setSize(300,30);
        update.setLocation(100,370);
        add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < MainFrame.studentNumber; i++) {
                    textArea.append(MainFrame.st[i].toString()+"\n");
                }
            }
        });

        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(100,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenuPage().setVisible(true);
                parent.getListPage().setVisible(false);
            }
        });

    }
}