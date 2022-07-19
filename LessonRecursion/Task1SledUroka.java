import java.util.Scanner;

public class Task1SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        sum(x,y);
    }

    static void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
}
