import java.util.Scanner;

public class Task2SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();

        double avg = average(x,y);
        System.out.println(avg);
    }

    static double average(double x, double y){
        return (x +y)/ 2;

    }
}
