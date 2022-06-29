import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете първо число:");
        int  x = sc.nextInt();
        System.out.println("Въведете второ число:");
        int y = sc.nextInt();

        if(x>y){
            System.out.println(y + ", " + x);
        }else {
            if(y>x){
            System.out.println(x + ", " + y);
        }else{
                System.out.println("Числата са еднакви, опитай пак");
            }
        }
    }
}
