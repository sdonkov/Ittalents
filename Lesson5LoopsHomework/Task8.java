import java.util.Scanner;

public class Task8 {
    /*
    Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
Пример:
Въведете n:
2
11
33
Въведете n:
1
0
Въведете n:
4
3333
5555
7777
9999
Въведете n:
3
222
444
666
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("Input a positive number:");
            x = sc.nextInt();
        }while (x<1);
        int startNumber = x-1;
        for (int rows =0; rows<x; rows++){
            for(int column =0; column<x; column++){
                System.out.print(startNumber);
            }
            System.out.println();
            startNumber+=2;
        }

    }


}
