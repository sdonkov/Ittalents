import java.util.Scanner;

public class Task16Recursion {
    /*
    Задача 16:
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249
Изход: 200,150,100, 50.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int x = sc.nextInt();
        System.out.println("Enter second num");
        int y = sc.nextInt();
        int temp;
        if(x>y){
            temp = x;
            x = y;
            y = temp;
        }
        result(y,x,y);
    }

    static void result(int i, int x, int y ){
        if( i <x){
            return;
        }

        if(i % 50 ==0){
            System.out.print(i+ " ");
    }
        result(i -1 ,x,y);

    }
}
