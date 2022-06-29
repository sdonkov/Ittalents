import java.util.Scanner;

public class Figures9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int startNum=1;

        for(int rows=1; rows<=num; rows++){

            for(int spaces=num; spaces > rows;spaces--){
                System.out.print(" ");
            }

            for(int start=startNum; start<rows +startNum; start++){
                System.out.print(startNum);
            }
            System.out.println();
            startNum++;
        }
    }
}
