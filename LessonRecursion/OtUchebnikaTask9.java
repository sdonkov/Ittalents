import java.util.Scanner;

public class OtUchebnikaTask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        System.out.println("Enter number");
        int y = sc.nextInt();
        int sum = 0;
//        for (int i = 1; i <= y; i++) {
//            sum += x;
//        }
//        System.out.println(sum);
        System.out.println(plus(x, y, sum, 1));
    }

    static int plus(int x, int y, int sum, int i) {
        if (i > y) {
            return sum;
        }
        sum += x;

        return plus(x, y, sum, i + 1);
    }
}
