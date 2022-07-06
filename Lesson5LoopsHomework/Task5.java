import java.util.Scanner;

public class Task5 {
    /*
    Задача 5: Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Input first number");
             a = sc.nextInt();
            System.out.println("Input second number");
             b = sc.nextInt();
        }while (a==b);
        int min = a;
        int max = b;

        if(a>b){
            min=b;
            max=a;
        }
        for (int i = min; i<=max; i++){
            System.out.print(i + " ");
        }


    }
}
