import java.util.Scanner;

public class Task13 {
    /*
    Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
     */

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 2 and 27");
            num = sc.nextInt();
        }while (num<2 || num>27);


        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int tens = (i % 100) / 10;
            int units = i % 10;
            if (hundreds + tens + units == num) {
                System.out.print(i + ", ");
            }
        }
    }
}