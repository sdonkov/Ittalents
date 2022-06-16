import java.util.Scanner;

public class Task4Lesson2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert side A:");
        int a = sc.nextInt();
        System.out.println("Insert side B:");
        int b = sc.nextInt();
        System.out.println("Insert side C:");
        int c = sc.nextInt();
        boolean isTriangle = false;

        if (a>b +c || b > a+c || c > a +b){
            System.out.println(isTriangle);
        }
        else {
            System.out.println(!isTriangle);
        }

    }

}
