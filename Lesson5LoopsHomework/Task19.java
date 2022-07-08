import java.util.Scanner;

public class Task19 {
    /*Задача 19: Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter number between 10 and 99");
            num = sc.nextInt();
        }while (num>99 || num<10);
        while(num !=1){
            if(num % 2==0){
                num = num /2;
                if(num==1){
                    System.out.print(num);
                }else{
                    System.out.print(num + " ");
                }
            }else {
                num = (num * 3)+1;
                System.out.print(num + " ");
            }
        }

    }
}