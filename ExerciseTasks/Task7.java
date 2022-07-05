import java.util.Scanner;

public class Task7 {

    /*
     * Task7. Write a program that reads numbers A, B and C. A must be short. B and C must be < 7. The
     * program has to invert the bits from number A on positions B and C. Print the new value of A.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a");
        int a = sc.nextInt();
        int b;
        int c;
        do{
            System.out.println("Insert b ");
            b = sc.nextInt();
            System.out.println("Insert c");
            c = sc.nextInt();
        }while(b> 7 || c >7);
        a = a ^ (1 << b);
        a = a ^ (1 << c);
        System.out.println(a);


    }


}
