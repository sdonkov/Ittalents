import java.util.Scanner;

public class Task18 {
    /*
 Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Enter number between 1 and 9:");
             a = sc.nextInt();
            System.out.println("Enter number between 1 and 9:");
             b= sc.nextInt();
        }while (a < 1 || a>9 || b <1 || b >9);
        int result =0;
        for (int i =1; i <=a; i++){
            for(int j =1; j<=b; j ++){
                result = i*j;
                System.out.println(i + "*" + j + "= " + result);
            }
        }
    }
}
