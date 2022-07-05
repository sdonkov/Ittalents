import java.util.Scanner;

public class Task4 {

    /*
    Task4. Write a program that tells you if a number is prime.//prosto chislo
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i =2; i < num; i++){
            if(num % i ==0){
                isPrime=false;
                break;
            }
        }if(isPrime){
            System.out.println("prosto e");
        }else{
            System.out.println("Ne e prosto");
        }
    }
}
