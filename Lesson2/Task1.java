import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете A:");
        double a = sc.nextDouble();

        System.out.println("Въведете B:");
        double b = sc.nextDouble();

        System.out.println("Въведете C:");
        double c = sc.nextDouble();

        if (c > a && c < b){
            System.out.println("Числото " + c + " е между " + a + " и " + b);
        }else{
            System.out.println("Числото " +c + " не е между " +a + " и " +b);
        }
    }

}
