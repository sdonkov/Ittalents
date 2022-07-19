import java.util.Scanner;

public class Task18Recursion {
    /*
    Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int a = sc.nextInt();
        System.out.println("Enter num");
        int b = sc.nextInt();

        int result =0;
        table(a,b,0,1);

//        for(int mnojitel = 1; mnojitel<=a; mnojitel++){
//            for(int umnojaemo = 1; umnojaemo <=b; umnojaemo++){
//                result = mnojitel * umnojaemo;
//                System.out.println(mnojitel + "*" + umnojaemo + " = " + result);
//            }
//        }

    }

    static void table(int a, int b, int result, int mnojitel){
        if(mnojitel > a){
            return;
        }

        for(int umnojaemo = 1; umnojaemo <=b; umnojaemo++){
            result = mnojitel * umnojaemo;
            System.out.println(mnojitel + "*" + umnojaemo + " = " + result);
        }

        table(a,b,result, mnojitel + 1);
    }

}
