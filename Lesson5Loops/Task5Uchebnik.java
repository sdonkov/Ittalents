import java.util.Scanner;

public class Task5Uchebnik {
    /*
    да се състави програма, която прочита две числа и извежда сумата
    на техните факториели
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do{
            System.out.println("Enter a positive number");
            a = sc.nextInt();
            System.out.println("Enter a positive number");
            b = sc.nextInt();
        }while (a<1|| b<1);
        int firstResult =1;
        for(int first = 1; first<=a; first++){
             firstResult = firstResult * first;
        }
        int secondResult = 1;
        for(int second = 1; second <=b ; second++){
            secondResult = secondResult * second;
        }
        int finalResult = firstResult + secondResult;
        System.out.println(finalResult);
    }
}
