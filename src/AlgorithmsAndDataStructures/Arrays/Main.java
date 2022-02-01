package AlgorithmsAndDataStructures.Arrays;

//поиск ++
//вставка элементов ++
//удаление элементов

import java.util.ArrayList;
import java.util.Scanner;

//с дубликатами и без
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] arr = {1, 2, 3 ,4 ,5 ,6, 6, 5};
        int key = 6;
        System.out.print("Enter element, that you want to paste into array: ");
        int  paste = cin.nextInt();
        pasteIntoArray(arr, paste);
        System.out.println();
        binarySearch(arr, key);
        System.out.print("Enter element, that you want to delete in array: ");
        int element = cin.nextInt();
        deleteArray(arr,element);
    }

    public static void deleteArray(int arr[], int element)
    {
        int index = 0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == element)
            {
                index = i;
            }
        }
        for(int i=index; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        n--;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void pasteIntoArray(int arr[], int paste)
    {
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length;i++)
        {
            arr2[i] = arr[i];
        }

        arr = new int[8];

        arr[arr.length-1] = paste;
        for(int i=0; i<arr2.length;i++)
        {
            arr[i] = arr2[i];
        }

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void binarySearch(int arr[], int key)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int low = arr[0];
        int high = arr.length - 1;
        int index = 0;
        while(true)
        {
            int mid = (low+high)/2;
            if(arr[mid]<key)
            {
                low = mid + 1;
            } else if(arr[mid]>key)
            {
                high = mid - 1;
            } else if(arr[mid]==key)
            {
                index = mid;
                low = low + 1;
                list.add(index);
            }
            if(mid == arr.length-1) break;
        }

        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i) == list.get(i+1))
            {
                list.remove(i);
            }
        }
        System.out.println("Index of element: " + list);
    }
}
