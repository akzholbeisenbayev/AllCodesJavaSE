package BitlabAcademy.SocketAndThreads.Task2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private MainFrame parent;
    private JButton conButton;
    public  MainMenu(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        conButton = new JButton("Sign in");
        conButton.setSize(150, 30);
        conButton.setLocation(50, 300);
        add(conButton);
        conButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);
            }
        });
    }
}