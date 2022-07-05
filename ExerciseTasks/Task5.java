import java.util.Scanner;



public class Task5 {
    public static void main(String[] args) {

        /*
         Task5. Write a program that reads a positive number and writes its binary representation.
         */

        Scanner sc= new Scanner(System.in);
        int num;
        int mnojitel = 1;
        int sum =0;
        do{
            System.out.println("Input a positive number:");
            num = sc.nextInt();
        } while(num <=0);
        while(num>0){
            int ostatuk = num % 2;
            num = num/2;
            sum  = sum + ostatuk * mnojitel;
            mnojitel = mnojitel *10;
        }
        System.out.println(sum);
    }
}
