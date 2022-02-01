import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[]arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = scanner.nextInt();
        }
        tri(arr);
    }

    public static void tri(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){ //24 5 42 5 1 0
                                            // i = 2 -> arr[i] = 42
                                            //arr[j] = 24, 5, 42, 5,0 1
            for(int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++; //1
                }
            }
            if(count == 1){
                System.out.print(arr[i] + "\t"); //24 42 1 0
            }
            count = 0;
        }
    }
}