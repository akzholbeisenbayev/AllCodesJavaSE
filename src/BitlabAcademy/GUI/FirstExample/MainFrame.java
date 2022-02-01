package BitlabAcademy.GUI.FirstExample;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //Объявляем конструктор нашего MainFrame. Именно тут происходит отрисовка нашего окна
    public MainFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
    }
}
