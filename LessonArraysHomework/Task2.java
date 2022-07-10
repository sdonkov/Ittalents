import java.util.Scanner;

public class Task2 {
    /*
    Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter length of array");
            arrayLen = sc.nextInt();
        }while (arrayLen<1);

        int[] array = new int[arrayLen];
        int[] finalArray = new int[arrayLen];

        for (int i =0; i<array.length; i++){
            System.out.println("Enter value");
            array[i] = sc.nextInt();
        }
        int arrayHalf = array.length /2;

        // first half - same
        for(int i =0; i <arrayHalf; i++){
            finalArray[i] = array[i];
        }

        // second half - mirror
        for(int i = array.length - 1; i>= array.length/2; i--){
            finalArray[i] = array[arrayHalf];
            arrayHalf++;
        }

        System.out.println("Starting array is:");
        for (int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("New array is:");
        for (int i =0; i<finalArray.length; i++){
            System.out.print(finalArray[i] + " ");
        }

    }
}
