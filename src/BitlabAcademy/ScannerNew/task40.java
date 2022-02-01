package BitlabAcademy.ScannerNew;

public class task40
{
    public static void main(String[] args) {
        int resultplane = 200000;
        int x = 5000;

        Double bonus = 5000*0.05;
        Double megabonus = 200000*0.2;

        int count = resultplane/x; // 40 штук

        Double resultbonus = count * bonus; //40*250=10 000
        Double resultcash = resultbonus + megabonus;//10 000 + 40 000 = 50 000

        System.out.println(resultcash);
    }
}
