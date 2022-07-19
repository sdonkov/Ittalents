import java.util.Scanner;

public class Task6LoopWithRecursion {
    /*
    Задача 6: Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter positive number");
            num = sc.nextInt();
        }while(num<1);
        int result = 0;
        System.out.println(sum(num, result));
    }

    static  int sum(int num, int totalSum){
        if(num <1){
            return totalSum;
        }
        totalSum+= num;
       return sum(num -1, totalSum);
    }
}
