import java.util.Scanner;

public class Task5Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number");
            num = sc.nextInt();
        }while (num<1);

        int ostatuk;
        int mnojitel =1;
        int result = 0;
        while(num>0){
            ostatuk = num %2;
            result += ostatuk * mnojitel;
            num = num/2;
            mnojitel = mnojitel*10;

        }
        System.out.println(result);
    }
}
