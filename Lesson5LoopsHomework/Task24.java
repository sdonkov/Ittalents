import java.util.Scanner;

public class Task24 {
    /*
    Задача 24:
Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a number:");
            num = sc.nextInt();
        }while(num<10 || num >30000);
        int firstNum = num;
        int reversedNum = 0;
        int ostatuk =0;
        do{
            ostatuk = num %10;
            reversedNum = reversedNum * 10 + ostatuk;
            num = num/10;
        }while(num!=0);
        if(firstNum == reversedNum){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
