package AlgorithmsAndDataStructures.BinarySearch;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3 ,4 ,5 ,6, 7};
        int key = 10;

        System.out.println("Index of element: " + binarySearch(arr, key));
    }

    public static int binarySearch(int arr[], int key)
    {
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
                break;
            }
        }

        return index;
    }

}
