import java.util.Scanner;

public class Task2WithDoubles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число");
        double a = sc.nextDouble();
        System.out.println("Въведете друго число");
        double b = sc.nextDouble();

        if(a!=b){
            double sum = a + b;
            double sub = a- b;
            double mul = a*b;
            double divByRemainder = a % b;
            double divWithoutRemainder = a/b;
            System.out.println(sum);
            System.out.println(sub);
            System.out.println(mul);
            System.out.println(divByRemainder);
            System.out.println(divWithoutRemainder);
        }else {
            System.out.println("числата са еднакви, опитай пак");
        }
    }
}
