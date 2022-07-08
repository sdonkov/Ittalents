import java.util.Scanner;

public class Task25 {
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
        int num;
        // По конвенция, 0! = 1
        do{
            System.out.println("Enter a positive number between 0 and 15");
            num = sc.nextInt();
        } while (num<0 || num > 15);
        if(num ==0 || num ==1){
            System.out.println("1");
        }else {
            long result = 1L;
            long newNum = 2L;
            do {
                result = result * newNum;
                newNum++;
            } while (num >= newNum);
            System.out.println(result);
        }

    }
}
