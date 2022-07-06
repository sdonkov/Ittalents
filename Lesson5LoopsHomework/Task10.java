import java.util.Scanner;

public class Task10 {
    /*
    Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter a positive number:");
            a = sc.nextInt();
        }while (a<1);
        boolean isPrime=true;

        for(int i=2;i<a;i++){
            if(a % i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
