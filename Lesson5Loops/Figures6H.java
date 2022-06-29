import java.util.Scanner;

public class Figures6H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int allNums =1;

        for(int row = 1; row <= num; row++){

            //spaces
            for(int spaces =0; spaces< num-row; spaces++){
                System.out.print("  ");
            }
            //nums
            for(int startingNum = 1; startingNum<=allNums; startingNum++ ){
                System.out.print(startingNum);
                System.out.print(" ");
            }
            for(int rightSide = row - 1; rightSide>0; rightSide--){
                System.out.print(rightSide);
                System.out.print(" ");
            }
            allNums++;
            System.out.println();
        }
    }
}
