import java.util.Scanner;

public class Task9WithoutAdditionalArray {
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
        do{
            System.out.println("Enter array length:");
            arrayLen = sc.nextInt();
        }while (arrayLen<1);

        int[] array = new int[arrayLen];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value:");
            array[i] = sc.nextInt();
        }
        int tempLen = arrayLen;
        int temp;
        for(int i =0; i<array.length /2; i++){
            temp = array[i];
            array[i] = array[tempLen -1];
            array[arrayLen -1 ]= temp;
            tempLen--;
            arrayLen--;
        }
        for (int i = array.length-1; i  >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
