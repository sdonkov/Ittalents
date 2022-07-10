import java.util.Scanner;

public class Task9 {
    /*
    Задача 9:
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter array length:");
            arrayLen = sc.nextInt();
        }while(arrayLen<1);

        int[] array = new int[arrayLen];
        int[] reversedArray = new int[arrayLen];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value");
            array[i] = sc.nextInt();
        }
        int temp = arrayLen;
        for (int i = 0; i < array.length; i++) {
            reversedArray[temp-1] = array[i];
            temp--;
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[arrayLen - 1] + " ");
            arrayLen--;
        }
    }
}
