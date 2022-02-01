package ACMPru.twoDimensionalMatrix;

import java.util.Scanner;

public class T58
{
    public static void main(String[] args)
    {

        Scanner cin = new Scanner(System.in);

        int t = 1;
        t = cin.nextInt();
        while(t>0)
        {
            solve();
            t--;
        }
    }

    public static void solve()
    {
        Scanner cin = new Scanner(System.in);
        int n, m;
        n = cin.nextInt();
        m = cin.nextInt();

        int a[][] = new int[n][m];


        for(int i=0; i<n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = cin.nextInt();
            }
        }

        boolean isSimp = true;

        for(int i=0; i<n-1; i++)
        {
            for (int j = 0; j < m-1; j++)
            {
                if ((a[i][j] + a[i + 1][j] + a[i][j + 1] + a[i + 1][j + 1]) % 4 == 0)
                    isSimp = false;
            }
        }

        if (isSimp) System.out.println("YES");
        else System.out.println("NO");
    }
}
