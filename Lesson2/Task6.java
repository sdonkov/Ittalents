import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първо число:");
        int a = sc.nextInt();
        System.out.println("Въведете второ число:");
        int b = sc.nextInt();
        System.out.println("Въведете трето число:");
        int c = sc.nextInt();
        int x;
        if(a != b && a !=c && b != c){
            x = a;
            a = b;
            b = c;
            c = x;
            System.out.println(a + ", " + b +", "+ c);
        }else{
            System.out.println("Числата не са различни, опитай пак");
        }
    }
}
