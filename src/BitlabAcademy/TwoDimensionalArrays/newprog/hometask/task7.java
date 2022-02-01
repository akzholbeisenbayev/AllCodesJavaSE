package BitlabAcademy.TwoDimensionalArrays.newprog.hometask;
import java.util.Scanner;

public class task7
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] arr = new int[n][m];


        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE, max_ind1 = 0, max_ind2 = 0; //i j
        int min = Integer.MAX_VALUE, min_ind1 = 0, min_ind2 = 0; //i j


        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    max_ind1 = i;
                    max_ind2 = j;
                }
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                    min_ind1 = i;
                    min_ind2 = j;
                }
            }
        }

        arr[max_ind1][max_ind2] = min;
        arr[min_ind1][min_ind2] = max;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
