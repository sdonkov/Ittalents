import java.util.Scanner;

public class Task15Recursion {
    /*
    Задача 15: Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

//        for(int i =1; i <=n; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n==1){
            return n;
        }

        return n + sum(n-1);
    }
}
