import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първо двуцифрено число:");
        int a = sc.nextInt();
        System.out.println("Въведете второ двуцифрено число:");
        int b = sc.nextInt();
        if(a>=10 && a <100 && b >=10 && b<100){
            int sum;
            int lastDigit;
            sum = a *b;
            lastDigit = sum % 10;
            if(lastDigit % 2 ==0){
                System.out.println(sum + ", " + lastDigit + " четна");
            }else{
                System.out.println(sum + ", " + lastDigit +" нечетна");
            }
        }else{
            System.out.println("Въведените числа не са двуцифрени, опитай пак");
        }
    }
}
