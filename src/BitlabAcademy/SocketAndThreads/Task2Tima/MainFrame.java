package BitlabAcademy.SocketAndThreads.Task2Tima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MainFrame  extends JFrame {
    public JButton button;
    public JTextField IPfield;
    public JTextField Textfield;
    public ChatMenu chatMenu;
    public MainMenu mainMenuPage;


    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat Application");
        setSize(500, 500);
        setLayout(null);



        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        chatMenu = new ChatMenu(this);
        chatMenu.setVisible(false);
        add(chatMenu);
    }

    public ChatMenu getChatMenu(){
        return chatMenu;
    }

    public MainMenu getMainMenuPage(){
        return mainMenuPage;
    }
}
