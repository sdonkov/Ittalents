import java.util.Scanner;

public class Task11 {
    /*
    Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
       *
      ***
     *****

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int startingStars =1;
        do {
            System.out.println("Enter a positive number");
            x = sc.nextInt();
        }while(x<1);
        int startingSpaces =x-1;
        for(int row = 0; row< x; row++){
            for(int spaces = 0; spaces < startingSpaces; spaces++){
                System.out.print(" ");
            }
            for(int stars = 0; stars <startingStars; stars ++){
                System.out.print("*");
            }
            System.out.println();
            startingSpaces--;
            startingStars+=2;
        }
    }

}
