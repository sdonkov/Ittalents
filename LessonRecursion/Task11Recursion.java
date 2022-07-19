import java.util.Scanner;

public class Task11Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int num = sc.nextInt();
//        if (num>1){
//            int stars = (num *2 ) - 1;
//            int spaces = num;
//        }
        int startingSpaces = num -1;

        printTriangle(num,startingSpaces,1,0);


    }

    static void printTriangle(int num, int startingSpaces, int startingStars,int row){
        if(row ==num){
            return;
        }
        for(int spaces = 0; spaces < startingSpaces; spaces++){
            System.out.print(" ");
        }
        for(int stars = 0; stars <startingStars; stars ++){
            System.out.print("*");
        }
        System.out.println();
        startingSpaces--;
        startingStars+=2;
        printTriangle(num,startingSpaces,startingStars,row+1);
        }
}
