import java.util.Scanner;

public class Figures6J {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int startingSpaces = (num * 2) -3;
        int sideRight =1;
        //rows

        for(int rows  =1; rows <= num; rows++){

            //left side without spaces
            for(int leftSide = 1;leftSide<=rows; leftSide++){
                System.out.print(leftSide);
                System.out.print(" ");
            }
            // for spaces
            for (int spaces = startingSpaces; spaces>=1; spaces--){
                System.out.print("  ");
            }
            // for right side
            for(int startNum =sideRight; startNum>=1; startNum--){
                if (startNum==num){
                    startNum--;
                }
                System.out.print(startNum);
                System.out.print(" ");
            }
            System.out.println();
            startingSpaces -=2;
            sideRight++;
        }
    }
}
