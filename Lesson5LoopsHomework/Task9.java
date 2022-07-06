import java.util.Scanner;

public class Task9 {
    /*
    Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do{
            System.out.println("Enter a number:");
            a = sc.nextInt();
            System.out.println("Enter a different number:");
            b = sc.nextInt();
        }while (a==b);

        if(a>b){
            int temp =a;
            a=b;
            b= temp;
        }
        int sum =0;
        for (int i =a; i <=b; i++){
            if(i%3 !=0){
                int result = i*i;
                sum += result;
                System.out.print(result);
            }else{
                System.out.print("skip " + i);
            }
            if(sum<200 && i < b){
                System.out.print(", ");
            }else {
                break;
            }
        }


//        boolean sumIsBigger =false;
//        int sum =0;
//        for (int i =a; i*i<b; i++){
//            int result = i*i;
//            if(result %3==0){
//                System.out.print("skip " + i +", ");
//            }else{
//                System.out.print(result);
//                sum +=result;
//                if (sum >200){
//                    break;
//                }
//                if(i*i>b){
//                    sumIsBigger= true;
//                }
//                if(sumIsBigger){
//                    break;
//                }else{
//                    System.out.print(", ");
//                }
//
//            }
//        }

    }

}
