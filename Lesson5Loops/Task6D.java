import java.util.Scanner;

public class Task6D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // row
        for (int row =1; row<= num; row++){
            // num
            for(int numStart =1; numStart <=row; numStart++){
                System.out.print(numStart);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
