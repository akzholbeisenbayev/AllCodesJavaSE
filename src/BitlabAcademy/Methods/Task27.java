package BitlabAcademy.Methods;

import java.util.Scanner;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] array = new int[n];
        for(int i = 0;i< array.length;i++){
            array[i]=in.nextInt();
        }
        test(n,array);
    }
    public static void test(int n,int [] array){
        int temp =0;
        int max=0;
        int min=0;
        for(int i =0;i<array.length;i++){
            if(array[i]<array[min]){
                min=i;}
            if(array[i]>array[max]){
                max=i;}
        }if(max!=min){
            temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

//
//public class Task27 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int [] array = new int[n];
//        for(int i = 0;i< array.length;i++){
//            array[i]=in.nextInt();
//        }
//        methodArrays(n,array);
//    }
//    public static void methodArrays(int n,int [] array){
//        int t =0;
//        int maxIndex=0;
//        int minIndex=0;
//        for(int i =0;i<array.length;i++){
//            if(array[i]<array[minIndex]){
//                minIndex=i;}
//            if(array[i]>array[maxIndex]){
//                maxIndex=i;}
//        }if(maxIndex!=minIndex){
//            t=array[minIndex];
//            array[minIndex]=array[maxIndex];
//            array[maxIndex]=t;
//        }for (int i =0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//    }
//}