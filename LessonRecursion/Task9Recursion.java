import java.util.Scanner;

public class Task9Recursion {
    /*
    Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        for (int i = a; i < b; i++) {

        }
        nums(a,b,sum);
    }

    static void nums(int i,int b, int sum) {
        if(i ==b){
            return;
        }
        if (i % 3 == 0) {
            System.out.print("skip " + i + " ");
        } else {
            sum = sum + (i * i);
            if (sum > 200) {
                System.out.print(i * i + " ");
                return;
            }
            System.out.print(i * i + " ");
        }
        nums(i+1,b, sum);
    }
}