import java.util.Scanner;

public class Task7 {
    /*
    Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Input a positive number:");
            num = sc.nextInt();
        }while (num<1);

        for (int i=3; num>0; i+=3){
            if(num==1){
                System.out.print(i);
                break;
            }
            System.out.print(i +",");
            num--;
        }
    }
}
