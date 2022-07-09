import java.util.Scanner;

public class Task3SledUroka {
    public static void main(String[] args) {

//        int[] array = {4,121,23,14,6512,2,6,0};
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
