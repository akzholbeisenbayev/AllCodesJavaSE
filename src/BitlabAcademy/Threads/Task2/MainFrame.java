package BitlabAcademy.Threads.Task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame
{
    private JButton button;
     JLabel label;



    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Task 2 Threads");
        setSize(500,500);
        setLayout(null);

        label = new JLabel("#");
        label.setSize(50,50);
        label.setLocation(100,100);
        add(label);

        button = new JButton("FIRE");
        button.setSize(100,30);
        button.setLocation(100,200);


        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    ThreadButton threadButton = new ThreadButton();
                    threadButton.start();
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        add(button);
    }
}
