package BitlabAcademy.Methods.newPr;

public class Main
{
    public static void main(String[] args) {
        System.out.println(max(6,4));
        System.out.println(max(3.4, 7.8));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }else {
            return num2;
        }
    }
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
