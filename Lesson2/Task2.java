import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете първо число:");
        int a = sc.nextInt();
        System.out.println("Въведете второ число различно от първото:");
        int b = sc.nextInt();
        if(a!=b){
            int sum = a + b;
            int subtraction = a - b;
            int multiplication = a *b;
            int divByRemainder = a % b;
            int divWithoutRemainder = a/b;
            System.out.println(sum);
            System.out.println(subtraction);
            System.out.println(multiplication);
            System.out.println(divByRemainder);
            System.out.println(divWithoutRemainder);
        }else{
            System.out.println("Въведените числа са еднакви. Опитай пак");
        }
    }
}

