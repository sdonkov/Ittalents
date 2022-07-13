import java.util.Scanner;

public class Task7OtUchebnika {
    /*
    Да се състави програма, която да извежда ромб от символи
    границата на ромба да са числа, а вътрешността да е запълнена със символ '*'
    програмата да приема входни данни - естествено число,което е дължината на страната на ромба
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int side = sc.nextInt();
        char ch = '*';

        // upper half
        for(int row=1; row<= side; row++){
            for(int space=side; space>row; space--){
                System.out.print(" ");
            }
            if(row==1){
                System.out.println(row);
                continue;
            }
            System.out.print(row);
            for(int stars = 0; stars < 2 * (row-1) -1; stars++){
                System.out.print(ch);
            }
            System.out.print(row);
            System.out.println();
        }
        //lower half
        int starting =1;
        for(int row= side-1; row>0; row--){
            for(int space = 0; space < starting; space++){
                System.out.print(" ");
            }
            starting++;
            if(row ==1) {
                System.out.print(row);
                continue;
            }
            System.out.print(row);
            for(int stars= 0; stars < 2* (row-1) -1; stars++){
                System.out.print(ch);
            }
            System.out.print(row);
            System.out.println();
        }
    }
}
