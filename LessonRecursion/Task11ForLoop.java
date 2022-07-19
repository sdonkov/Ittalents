import java.util.Scanner;

public class Task11ForLoop {
    /*
    Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
  *
 ***
*****
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int num = sc.nextInt();

        for(int row = 1; row <=num; row++){

            for(int spaces = row; spaces<num;spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= (row * 2) - 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
