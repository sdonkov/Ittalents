import java.util.Scanner;

public class Figures6K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sideRight = num;
        int sideLeft = num;

        for (int row =1; row<=num; row++){

            // leftside
            for(int leftSide = 1; leftSide <= sideLeft; leftSide++){
                System.out.print(leftSide);
                System.out.print(" ");
            }
            // spaces
            for(int spaces=0; spaces<(2 * row )- 3; spaces++){
                System.out.print("  ");
            }
            // righside
            for(int rightSide = sideRight; rightSide>0; rightSide--){
                if(rightSide==num){
                    rightSide--;
                }
                System.out.print(rightSide);
                System.out.print(" ");
            }
            System.out.println();
            sideRight--;
            sideLeft--;

        }

    }
}
