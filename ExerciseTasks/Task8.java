import java.util.Scanner;

public class Task8 {

    /*
     * Task8. Write a program that reads a number and prints a triangle of stars with the height of
     * the number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        for(int row = 1; row <= num; row++){
            for(int star = 1; star <=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
