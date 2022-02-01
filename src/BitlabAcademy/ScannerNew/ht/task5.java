package BitlabAcademy.ScannerNew.ht;

public class task5
{
    public static void main(String[] args) {
        char l = 'a' - 32; //97
        char d = (char) 97;
//        char u = (char) (l-32); //'A' = 65
        System.out.println(l);
        System.out.println(d);
        System.out.println();

        int a= 123;
        System.out.println(a%10); //123/10=120+3 =123
        System.out.println(a/10%10);//123/10= 12%10 = 2
        System.out.println(a/100);


        double num = 50.5676666;

        System.out.println(Math.round(num));//округлить
        System.out.println(Math.floor(num));//пол
        System.out.println(Math.ceil(num));//потолок

        //Math.round () - округляет до ближайшего целого числа.
        //Math.floor () - округляет число до ближайшего целого вниз.
        //Math.ceil() - округляет число до ближайшего целого вверх.

        //Если хотите округлить на "n" цифр после точки, то:
        double digits = Math.pow(10, 2); //10^2 = 100
        System.out.println(Math.round(num * digits) / digits);
        //50.5676666*100
        //5056.76666->5057/100=50.57


    }
}
