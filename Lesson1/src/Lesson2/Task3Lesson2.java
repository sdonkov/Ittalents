import java.util.Scanner;

public class Task3Lesson2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете страна А:");
        int a = sc.nextInt();
        System.out.println("Въведете старана B:");
        int b = sc.nextInt();

        int area = a * b;

        System.out.println(area);

    }

}
