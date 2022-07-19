import java.util.Scanner;

public class Task8Recursion {
    /*
    Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
Въведете n:
4
3333
5555
7777
9999
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        result(num, count, num-1);
    }

    static void result(int num, int count, int numPrinted) {
        if(count == num){
            return;
        }
        printResult(num,0,numPrinted);
        System.out.println();
        result(num, count+ 1, numPrinted + 2);
    }

    static void printResult(int num, int count, int numPrinted) {
        if(count == num){
            return;
        }
        System.out.print(numPrinted);
        printResult(num,count + 1,numPrinted);
    }


}
