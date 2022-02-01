package BitlabAcademy.GUI.Task2;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private AddPage addPage;
    private ListPage listPage;

    public static Student[] st = new Student[10];
    public static int studentNumber =0;

    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Application");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addPage = new AddPage(this);
        addPage.setVisible(false);
        add(addPage);

        listPage = new ListPage(this);
        listPage.setVisible(false);
        add(listPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public void setMainMenuPage(MainMenu mainMenuPage) {
        this.mainMenuPage = mainMenuPage;
    }

    public AddPage getAddPage() {
        return addPage;
    }

    public void setAddPage(AddPage addPage) {
        this.addPage = addPage;
    }

    public ListPage getListPage() {
        return listPage;
    }

    public void setListPage(ListPage listPage) {
        this.listPage = listPage;
    }
}

