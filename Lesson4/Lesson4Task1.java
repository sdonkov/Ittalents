import java.util.Scanner;

public class Lesson4Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете числото а:");
        int a = sc.nextInt();
        System.out.println("Въведете числото b:");
        int b = sc.nextInt();
        System.out.println("Въведете числото c:");
        int c = sc.nextInt();
        if(a>b && a >c){
            System.out.println(a);
        }else{
            if(b>a && b >c){
                System.out.println(b);

            }else{
                System.out.println(c);
            }
        }
    }
}
