import java.util.Scanner;

public class Lesson4Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете числото а:");
        int a = sc.nextInt();
        System.out.println("Въведете числото b:");
        int b = sc.nextInt();
        System.out.println("Въведете числото c:");
        int c = sc.nextInt();

        if(b>a && b <c){
            System.out.println(b + " е между " + a + " " + c );
        }else{
            System.out.println(b + " не е между " + a+ " " +c);
        }
    }
}
