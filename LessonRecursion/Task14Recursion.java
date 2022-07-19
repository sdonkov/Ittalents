import java.util.Scanner;

public class Task14Recursion {
    /*
    Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        }while (n<10 || n >200);

        divideBySeven(n);

//        for(int i = n; i >6; i--){
//            if(i % 7 ==0){
//                System.out.print(i+ " ");
//            }
//        }
    }

    static void divideBySeven(int i){
        if(i<7){
            return;
        }

        if(i % 7 ==0){
            System.out.print(i+ " ");
    }
        divideBySeven(i-1);
    }
}
