import java.util.Scanner;

public class Task5LoopWithRecursion {
    /*
    Задача 5: Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int firstNum = sc.nextInt();
        System.out.println("Enter second num");
        int secondNum = sc.nextInt();
        int x;
        if(firstNum > secondNum){
            x= firstNum;
            firstNum= secondNum;
            secondNum = x;
        }
        arrangedNums(firstNum,secondNum);

    }

    static void arrangedNums(int firstNum, int secondNum){
        if(firstNum > secondNum){
            return;
        }
        System.out.print(firstNum + " ");
        arrangedNums(firstNum+1, secondNum);
    }
}
