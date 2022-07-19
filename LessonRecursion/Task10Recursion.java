import java.util.Scanner;

public class Task10Recursion {
    /*
    Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        boolean isPrime = true;

        System.out.println(checkPrime(num, 2));
    }

    static boolean checkPrime(int num, int i){
        if(i==num){
            return true;
        }
        if(num % i ==0){
            return false;
        }
        return checkPrime(num, i +1);

    }

}

