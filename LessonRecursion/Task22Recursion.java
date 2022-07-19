import java.util.Scanner;

public class Task22Recursion {
    /*
    Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        nums(num,0);

    }

    static void nums(int num, int counter) {
        if(counter > 10){
            return;
        }
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            counter++;
            if (counter == 10) {
                System.out.print(counter + ":" + num);
                return;
            } else {
                System.out.print(counter + ":" + num + ", ");
                num++;
            }

        } else {
            num++;
        }
        nums(num,counter);

    }
}
