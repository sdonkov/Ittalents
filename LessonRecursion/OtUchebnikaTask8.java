import java.util.Scanner;

public class OtUchebnikaTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean isPrime = true;
//        for(int i =2; i<num; i++){
//            if(num%i == 0){
//                isPrime = false;
//                break;
//            }
//        }
        System.out.println(isPrime(num,isPrime,2));
    }


    static boolean isPrime(int num, boolean isPrime, int delitel){
        if(num == delitel){
            return isPrime;
        }
        if(num % delitel ==0){
            return false;
        }
        return isPrime(num, isPrime, delitel +1);
    }
}
