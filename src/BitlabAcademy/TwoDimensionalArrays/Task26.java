package BitlabAcademy.TwoDimensionalArrays;
public class Task26 {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i*10+j + 1;
            }
        }
        for(int i=0; i<10; i++){
            if(i%2==0){
                for(int j=0; j<10; j++)
                    System.out.print(arr[i][j] + " ");
            }
            if(i%2==1){
                for(int j=9;j>=0;j--)
                    System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

    }
}
