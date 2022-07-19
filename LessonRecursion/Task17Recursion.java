import java.util.Scanner;

public class Task17Recursion {
    /*
    Задача 17:
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int b = sc.nextInt();
        System.out.println("Enter char");
        char ch = sc.next().charAt(0);

//        for(int row = 1; row<=b; row++){
//            if(row ==1 || row== b){
//                for(int i =0; i<b; i++){
//                    System.out.print("*");
//                }
//            }else{
//                System.out.print("*");
//                for(int chars = 0; chars<b-2; chars++){
//                    System.out.print(ch);
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        figure(1,b,ch);
    }

    static void figure(int row, int b, char ch){
        if(row>b){
            return;
        }
        if(row ==1 || row== b){
            for(int i =0; i<b; i++){
                System.out.print("*");
            }
        }else{
            System.out.print("*");
            for(int chars = 0; chars<b-2; chars++){
                System.out.print(ch);
            }
            System.out.print("*");
        }
        System.out.println();

        figure(row + 1,b,ch);
    }
}
