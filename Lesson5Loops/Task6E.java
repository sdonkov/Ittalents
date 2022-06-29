import java.util.Scanner;

public class Task6E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastNum= num;
        // row
        for (int row =1; row<= num; row++) {

            // spaces
            for(int spaces = 0; spaces < row - 1; spaces++){
                System.out.print("  ");
            }

            // num
            for (int numStart = 1; numStart <= lastNum; numStart++) {
                System.out.print(numStart);
                System.out.print(" ");
            }
            System.out.println();
            lastNum--;
        }
    }
}
