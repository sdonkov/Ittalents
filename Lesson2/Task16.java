import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете трицифрено число");
        int num = sc.nextInt();
        if(num>=100 && num <1000){
            int firstDigit = num /100;
            int secondDigit = (num %100) /10;
            int thirdDigit = num %10;
            if(firstDigit == secondDigit && secondDigit == thirdDigit){
                System.out.println("цифрите са равни");
            }else{
                if(firstDigit < secondDigit && secondDigit < thirdDigit){
                    System.out.println("цифрите са във възходящ ред");
                }else{
                    if(firstDigit > secondDigit && secondDigit > thirdDigit){
                        System.out.println("цифрите са във низходящ ред");
                    }else {
                        System.out.println("цифрите са ненаредени");
                    }
                }
            }
        }else {
            System.out.println("въведеното число не е трицифрено, опитай пак");
        }
    }
}
