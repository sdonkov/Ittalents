import java.util.Scanner;
/*
1,1,2,3,5,8,13,21,34,55,89
 */
public class Task5SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));

    }
    static int fib(int num){
        if(num==1 || num==2){
            return 1;
        }

        return fib(num-1) + fib(num-2);
    }
}
