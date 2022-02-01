package GreetGoPreparation.Searchs;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        int first = 0; //первый элемент массива
        int last = sortedArray.length - 1; //последний элемент массива

        System.out.println(binarySearch(sortedArray, 2, first, last));
    }

    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
