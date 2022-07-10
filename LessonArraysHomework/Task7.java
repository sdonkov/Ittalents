import java.util.Scanner;

public class Task7 {
    /*
    Задача 7:
Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter length of the array:");
            arrayLen = sc.nextInt();
        }while (arrayLen<1);

        int[] originalArray = new int[arrayLen];
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Enter value:");
            originalArray[i] = sc.nextInt();
        }
        int[] secondArray = new int[originalArray.length];

        for(int i=0; i <originalArray.length; i ++){
            if(i == 0 || i == originalArray.length-1){
                secondArray[i] = originalArray[i];
            }else{
                secondArray[i] = originalArray[i-1] + originalArray[i+1];
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
