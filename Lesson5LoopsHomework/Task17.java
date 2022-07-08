import java.util.Scanner;

public class Task17 {
    /*
    Задача 17:
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char a;
        do {
            System.out.println("Enter a number between 3 and 20");
            num = sc.nextInt();
            System.out.println("Enter a symbol");
            a = sc.next().charAt(0);
        }while (num>20 || num<3);
        for(int row=1; row<=num; row++){
            if(row==1 || row == num){
                // first or last row
                for (int star = 0; star< num; star++){
                    System.out.print("#");
                }
            }else{
                // every other row  = * + symbols +*
                System.out.print("#");
                for (int symbol = 0; symbol<num-2; symbol++){
                    System.out.print(a);
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
