package Codeforces.D725Div3;

import java.util.ArrayList;
import java.util.Scanner;

public class A
{
    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args)
    {

        Scanner cin = new Scanner(System.in);

        int t = 1;
        t = cin.nextInt();

        while(t!=0)
        {
            int n = cin.nextInt();

            for(int i=0; i<n; i++)
            {
                int x = cin.nextInt();
                a.add(x);
            }

            int indexMin = findIndexMin(a, n);
            int indexMax = findIndexMax(a, n);

            int sum = 0;
            if(indexMax > indexMin && indexMax>n/2 && indexMin>n/2)
            {
                sum+=n-indexMax;
                a.remove(indexMax);
                indexMin=findIndexMin(a, a.size());
                sum+=a.size()-indexMin;
                a.remove(indexMin);
            }else if(indexMax > indexMin && indexMax<n/2 && indexMin<n/2)
            {
                sum+=indexMin+1;
                a.remove(indexMin);
                indexMax = findIndexMax(a,a.size());
                sum+=indexMax;
                a.remove(indexMax);
            }else if(indexMax < indexMin && indexMax<n/2 && indexMin<n/2)
            {
                sum+=indexMax+1;
                a.remove(indexMax);
                indexMin = findIndexMin(a,a.size());
                sum+=indexMin+1;
                a.remove(indexMin);
            }else if(indexMax < indexMin && indexMax>n/2 && indexMin>n/2)
            {
                sum+=n-indexMin;
                a.remove(indexMin);
                indexMin=findIndexMax(a, a.size());
                sum+=a.size()-indexMax;
                a.remove(indexMax);
            }else if(indexMax < indexMin)
            {
                sum+=indexMax+1;
                a.remove(indexMax);
                indexMin = findIndexMin(a, a.size());
                sum+=n-indexMin;
                a.remove(indexMin);
            }else
            {
                sum+=indexMin+1;
                a.remove(indexMin);
                indexMax = findIndexMax(a, a.size());
                sum+=n-indexMax;
                a.remove(indexMax);
            }
            System.out.println(sum);
            t--;
        }
    }

    public static int findIndexMax(ArrayList<Integer> a, int n)
    {
        int max = Integer.MIN_VALUE, maxIndex = 0;
        for(int i=0; i<n; i++)
        {
            if(a.get(i)>max)
            {
                max = a.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findIndexMin(ArrayList<Integer> a, int n)
    {
        int min = Integer.MAX_VALUE, minIndex = 0;
        for(int i=0; i<n; i++)
        {
            if(a.get(i)<min)
            {
                min = a.get(i);
                minIndex = i;
            }
        }

        return minIndex;
    }
}
