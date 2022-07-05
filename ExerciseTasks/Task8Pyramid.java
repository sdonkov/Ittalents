import java.util.Scanner;

public class Task8Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = sc.nextInt();
        int stars = 1;
        int spaces = num - 1;

        for (int row = 0; row < num; row++) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");}
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }
                System.out.println();
                stars += 2;
                spaces--;
            }
        }
    }