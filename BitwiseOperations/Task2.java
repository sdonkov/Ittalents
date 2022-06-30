import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Insert a number between 0 and 50");
            num=sc.nextInt();
        }while(num<0 || num >50);
        int ostatuk;
        int sum = 0;
        int mnojitel =1;
        while(num>0){
            ostatuk = num%2;
            sum = sum + (ostatuk * mnojitel);
            num = num/2;
            mnojitel = mnojitel*10;

        }
        System.out.println(sum);
    }
}
