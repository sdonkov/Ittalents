import java.util.Scanner;

public class Figures6F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int rows = 1; rows<=num; rows++){

            //spaces
            for (int spaces = 0; spaces <num-rows; spaces++){
                System.out.print("  ");
            }
            // numbers
            for(int startNum =rows; startNum>0;startNum--){
                System.out.print(startNum);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
