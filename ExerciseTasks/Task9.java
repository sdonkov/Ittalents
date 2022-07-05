import java.util.Scanner;

public class Task9 {

    /*
     * Task9. Modify task 8 to print a triangle that is hollow and has only a frame of stars.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = sc.nextInt();
        int stars = 1;
        int spaces = num - 1;
        int innerSpaces = 1;

        for (int row = 0; row < num; row++) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            if(row == 0 || row == num -1){
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
                }
            }else {
                System.out.print("*");
                for(int innerSpace = 0; innerSpace < innerSpaces; innerSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
                innerSpaces = innerSpaces+2;
            }
            System.out.println();
            stars = stars +2;
            spaces--;
        }
    }
}
