import java.util.Scanner;

public class Task25Recursion {
    /*
    Задача 25:
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fact(num,1,2));

    }

    static int fact(int num, int result, int newNum){
        if(newNum > num){
            return result;
        }

        result = result * newNum;
        newNum++;
        return fact(num,result,newNum);
    }

}
