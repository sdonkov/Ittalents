import java.util.Scanner;

public class Task21Recursion {
    /*
    Задача 21:
Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..51] и се извеждат въведения номер карта и
останалите по-големи карти от тестето.
Пример: 47.
Изход
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        magic(num);
    }

    static void magic(int i) {
        if (i > 52) {
            return;
        }

        int card = (((i - 1) / 4) + 2);
        int suit = i % 4;
        switch (card) {
            case 2:
                System.out.print("Двойка");
                break;
            case 3:
                System.out.print("Тройка");
                break;
            case 4:
                System.out.print("Четворка");
                break;
            case 5:
                System.out.print("Петица");
                break;
            case 6:
                System.out.print("Шестица");
                break;
            case 7:
                System.out.print("Седмица");
                break;
            case 8:
                System.out.print("Осмица");
                break;
            case 9:
                System.out.print("Деветка");
                break;
            case 10:
                System.out.print("Десетка");
                break;
            case 11:
                System.out.print("Вале");
                break;
            case 12:
                System.out.print("Дама");
                break;
            case 13:
                System.out.print("Поп");
                break;
            case 14:
                System.out.print("Асо");
                break;
        }
        System.out.print(" ");
        switch (suit) {
            case 0:
                System.out.print("пика");
                break;
            case 1:
                System.out.print("спатия");
                break;
            case 2:
                System.out.print("каро");
                break;
            case 3:
                System.out.print("купа");
                break;
        }
        if (i <= 51) {
            System.out.print(", ");
        }
        magic(i +1);
    }
}
