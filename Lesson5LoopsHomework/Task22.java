import java.util.Scanner;

public class Task22 {
    /*
    Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999].
Използвайте цикъл while.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number between 1 and 999");
            num = sc.nextInt();
        }while (num>999 || num <1);
        int counter =0;
        while(counter <=10){
            if(num % 2==0 || num % 3 ==0 || num % 5==0){
                counter++;
                if(counter ==10){
                    System.out.print(counter + ":" + num);
                    break;
                }else{
                    System.out.print(counter + ":" + num + ", ");
                    num++;
                }

            }else{
                num++;
            }
        }

    }
}
