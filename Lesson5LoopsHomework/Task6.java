import java.util.Scanner;

public class Task6 {
    /*
    Задача 6: Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("Input a positive number:");
            x = sc.nextInt();
        }while (x<1);

        int result =0;
        for(int i =1; i<=x; i++){
            result +=i;
        }
        System.out.println(result);
    }
}

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