package BitlabAcademy.Methods.newPr.practice;

import java.util.Scanner;
public class task9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = in.nextInt();
        }
        task9newArr(array);
    }

    public static void task9newArr(int[] array)
    {
        int i = 0;
        while(array[i] != 23)
        {
            if(array[i] % 2 != 0)
                System.out.println(array[i]);
            i++;
        }
    }
}
