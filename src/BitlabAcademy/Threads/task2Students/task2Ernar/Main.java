package BitlabAcademy.Threads.task2Students.task2Ernar;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        boolean check = false;
        while (check==false) {
            check= getFlag(mainFrame);
            ThreadLabel goLabel = new ThreadLabel("GoLabel", mainFrame, check);

            goLabel.start();
        }
    }

    public static boolean getFlag(MainFrame frame){
        return frame.isFlag();
    }

}
