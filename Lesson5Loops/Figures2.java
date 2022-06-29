import java.util.Scanner;

public class Figures2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Input a positive number:");
            a = sc.nextInt();
        } while (a < 1);
        for (int row = 1; row <= a; row++) {
            if (row% 2==0){
                System.out.print(" ");
            }
            System.out.print("#");
            for (int column = 1; column < a ; column++) {
                System.out.print(" ");
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
