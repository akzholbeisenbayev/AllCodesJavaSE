package BitlabAcademy.Methods.newPr.practice;

import java.util.Scanner;
public class task10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = in.nextInt();
        }
        task10newArr(array);

    }

    public static void task10newArr(int[] array)
    {
        //12 5 95 68 123 //3
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 5 != 0)
                sum += array[i]; //+12 +68+123
        }
        System.out.println(sum); //203
    }
}
