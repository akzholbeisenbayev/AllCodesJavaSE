package BitlabAcademy.SocketAndThreads.task2DanikB;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainMenu mainMenu;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bitlab Application");
        setSize(500, 500);
        setLayout(null);

        try {
            mainMenu = new MainMenu(this);
            mainMenu.setVisible(true);
            add(mainMenu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

}
