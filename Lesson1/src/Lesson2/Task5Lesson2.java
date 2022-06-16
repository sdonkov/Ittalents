import java.util.Scanner;

public class Task5Lesson2 {

    public static void main(String[] args){
        boolean validNum = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        if(number % 7 ==0) {
            System.out.println(!validNum);
        }
        else{
            System.out.println(validNum);
        }

    }
}
