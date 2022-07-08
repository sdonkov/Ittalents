import java.util.Scanner;

public class Task16 {
/*
Задача 16:
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("Enter a number in range between 10 and 5555");
            n = sc.nextInt();
            System.out.println("Enter a number between 10 and 5555");
            m = sc.nextInt();
        } while (n > 5555 || n < 10 || m > 5555 || m < 10);
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        for (int i = m; i >= n; i--) {
            if (i % 50 == 0) {
                if(i - 50<n){
                    System.out.print(i);
                }else{
                System.out.print(i + ", ");
            }
            }
        }
    }
}