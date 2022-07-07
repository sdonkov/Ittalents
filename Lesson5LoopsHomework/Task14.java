import java.util.Scanner;

public class Task14 {
    /*
    Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        do {
            System.out.println("Enter a number between 10 and 200");
            num = sc.nextInt();
        }while (num<10 || num >200);

        for (int i = num; i>=7; i--){
            if(i %7 ==0 && i < num){
                System.out.println(i);
            }
        }
    }
}
