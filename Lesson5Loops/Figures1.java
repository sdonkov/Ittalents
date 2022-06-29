import java.util.Scanner;

public class Figures1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Input a positive number:");
            a = sc.nextInt();
        }while (a<1);
        for(int row=0; row<a; row++){
            System.out.print("#");
            for(int column = 0; column<a -1; column++){
                System.out.print(" ");
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
