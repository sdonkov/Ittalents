import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първи координати на първата позиция:");
        int a1 = sc.nextInt();
        System.out.println("Въведете втори координати на първата позиция:");
        int a2 = sc.nextInt();
        System.out.println("Въведете първи координати на втората позиция:");
        int b1 = sc.nextInt();
        System.out.println("Въведете втори координати на втората позиция:");
        int b2 = sc.nextInt();

        int sumA = a1 + a2;
        int sumB = b1 + b2;

        if (a1 < 0 || a1 > 8 || a2 < 0 || a2 > 8 || b1 < 0 || b1 > 8 || b2 < 0 || b2 > 8) {
            System.out.println("невалидни координати, опитай пак");
        } else {
            if (sumA % 2 == 0 && sumB % 2 == 0) {
                System.out.println("позициите са с еднакъв цвят");
            } else {
                if (sumA % 2 != 0 && sumB % 2 != 0) {
                    System.out.println("позициите са с еднакъв цвят");
                } else {
                    System.out.println("позициите са с различен цвят");
                }
            }
        }
    }
}