import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първо число:");
        int a = sc.nextInt();
        System.out.println("Въведете второ число различно от първото:");
        int b = sc.nextInt();
        int x;
        if(a!=b){
            x = a;
            a = b;
            b = x;
            System.out.println("Новата стойност на първото число е:" + a);
            System.out.println("Новата стойност на второто число е:" + b);
        }else{
            System.out.println("Числата са еднакви. Опитай пак");
        }
    }
}
