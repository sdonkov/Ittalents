package demo;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,0,0,0,12,0,15,5,4,3,0,12};
        int counter = 0;
//        endZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
//        InterruptedException
//        NullPointerException
//        CopyOnWriteArrayList
//        System.gc(); -- напомняне да се пусне може и да не се съобрази и да не се пусне
        System.out.println(Arrays.toString(arr));
    }

    private static int[] endZeros(int[] arr){
        int counter = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter--;
            }
        }
        return arr;
    }
}
