import java.util.Scanner;

public class Task8Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space = num-1;
        int star = 1;
        for(int row = 0; row<num; row++){
            for (int spaces = 0; spaces <space; spaces++){
                System.out.print(" ");
            }
            for(int stars=0; stars < star; stars++){
                System.out.print("*");
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
