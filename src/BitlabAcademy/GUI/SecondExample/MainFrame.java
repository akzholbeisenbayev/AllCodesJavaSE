package BitlabAcademy.GUI.SecondExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    private JButton button;
    private JLabel label; //для текстового поля
    private JTextField textField;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);

        setLayout(null);

        label = new JLabel("HELLO BITLAB APPLICATION");
        label.setSize(300,30);
        label.setLocation(100,100); //100 пикселей отступа слева и 100 пикселей отступа сверху.
        add(label);

        textField = new JTextField("HELLO BITLAB APPLICATION");
        textField.setSize(300,30);
        textField.setLocation(100,150);

        add(textField);

        button = new JButton("CONFIRM");
        button.setSize(300,30);
        button.setLocation(100,200);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text = textField.getText();//HELLO
                if(!text.equals("")){
                    label.setText(text);
                    textField.setText("");
                }

            }
        });
        add(button);
    }
}