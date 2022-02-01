package BitlabAcademy.SocketAndThreads.task2Serik;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {
    private MainFrame parent;
    private JLabel label;
    private JButton conButton;
    private  JTextField textField1, textField2;
    public  FirstPage(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("IP");
        label.setSize(300,30);
        label.setLocation(50, 100);
        add(label);

        label = new JLabel("PORT");
        label.setSize(300,30);
        label.setLocation(50, 150);
        add(label);

        textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(130, 100);
        add(textField1);

        textField2 = new JTextField();
        textField2.setSize(300,30);
        textField2.setLocation(130, 150);
        add(textField2);

        conButton = new JButton("CONNECT");
        conButton.setSize(150, 30);
        conButton.setLocation(50, 300);
        add(conButton);
        conButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField1.equals("") && !textField2.equals("")){
                    textField1.setText("");
                    textField2.setText("");

                    parent.getFirstPage().setVisible(false);
                    parent.getSecondPage().setVisible(true);
                }
            }
        });

    }

}