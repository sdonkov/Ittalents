import java.util.Enumeration;
import java.util.Scanner;

public class Task13Recursion {
    /*
    Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        do {
            sum = sc.nextInt();
        } while (sum < 2 || sum > 27);
//        for (int i = 101; i < 1000; i++) {
//            int stotici = i / 100;
//            int desetici = i / 10 % 10;
//            int edinici = i % 10;
//            int total = stotici + edinici + desetici;
//            if (total == sum) {
//                System.out.print(i + ", ");
//            }
//        }
        sumOfNums(sum, 101);
    }

    static void sumOfNums(int num, int i) {
        if(i ==1000){
            return;
        }

        int stotici = i / 100;
        int desetici = i / 10 % 10;
        int edinici = i % 10;
        if (num == stotici + edinici + desetici) {
            System.out.print(i + ", ");
        }
        sumOfNums(num, i +1);
    }
}
