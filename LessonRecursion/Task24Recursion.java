import java.util.Scanner;

public class Task24Recursion {
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
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int revNum =palindrome(num,0,0);
        if(num == revNum){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrome");
        }

    }

    static int palindrome(int num, int ostatuk,int reversedNum){
        if(num==0){
            return reversedNum;
        }

        ostatuk = num %10;
        reversedNum = reversedNum * 10 + ostatuk;
        num = num/10;

        return palindrome(num,ostatuk,reversedNum);
    }
}
