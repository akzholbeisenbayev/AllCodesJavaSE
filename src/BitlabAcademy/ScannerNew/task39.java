package BitlabAcademy.ScannerNew;
public class task39
{
    public static void main(String[] args) {

        double a = 200;
        double b = 30;
        double d = a-(a*15/100);
        double n = d*10  + 2*b;

        a = 500;
        b = 50;
        d = a-(a*50/100);
        double n1 = d*7  + b;

        a = 300;
        b = 20;
        d = a-(a*10/100);
        double n2 = d*2  + b*3;

        System.out.println((int)n+" "+(int)n1+" "+(int)n2);
    }
}
