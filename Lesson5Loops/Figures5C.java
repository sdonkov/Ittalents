import java.util.Scanner;

public class Figures5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
//        int stars = (rows * 2) -1;
        int secondStars = ((rows -1) *2 )-1;

        for(int row =1; row <=rows; row++){
            //for row --> spaces and stars
            //spaces

            for(int spaces =0; spaces < rows -row; spaces++){
                System.out.print("  ");
            }
            // stars -> ((rows * 2) - 1) stars -=2

            for(int star = (row * 2) - 1; star>=1; star--){
                System.out.print("#");
                System.out.print(" ");
            }
//            stars -=2;
            System.out.println();
        }
        // second rows
        for (int secondHalfRows = rows -1; secondHalfRows>0; secondHalfRows--){
            // spaces
            for(int secondSpaces = 0; secondSpaces < rows - secondHalfRows; secondSpaces ++){
                System.out.print("  ");
            }
            // stars
            for (int secondStar = secondStars; secondStar>0; secondStar--){
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println();
            secondStars-=2;
        }
    }
}
