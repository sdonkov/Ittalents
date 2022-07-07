import java.util.Scanner;

public class Task15 {
    /*
    Задача 15: Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Използвайте цикъл do-while.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number:");
            num = sc.nextInt();
        }while (num<1);
        int sum = 0;
        do {
            sum +=num;
            num--;
        }while (num>=1);
        System.out.println(sum);
    }

    }


//
//
//    Scanner sc = new Scanner(System.in);
//    int x = sc.nextInt();
//        int result =0;
//        if(x < 0) {
//            for (int j = 1; j >= x; j--) {
//                result += j;
//            }
//        }else {
//        for(int i =1; i<=x; i++){
//            result +=i;
//        }
//
//    }System.out.println(result);
