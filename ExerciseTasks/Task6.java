import java.util.Scanner;

public class Task6 {
    /*
     * Task6. Write a program that reads a short positive number and tells how many bits are 1 in it.
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        int count =0;
        do{
            System.out.println("Input a positive number:");
            num = sc.nextInt();
        } while(num <=0);
        while(num>0){
           int ostatuk = num % 2;
            if(ostatuk ==1){
                count ++;
            }
            num = num/2;
        }
        System.out.println(count);
    }
}
