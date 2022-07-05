import java.util.Scanner;

public class Task3 {


    /*
     * Task3. Write a program that prints all numbers from A to B that can be divided by 3. A and B - from
     * operator from console. Numbers must be in ascending order.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a:");
        int a = sc.nextInt();
        System.out.println("Input number b:");
        int b = sc.nextInt();
        if (a > b) {
           int temp = a;
            a = b;
            b = temp;
            }
            for(int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
    }
}
