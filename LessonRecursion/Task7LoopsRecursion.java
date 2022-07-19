import java.util.Scanner;

public class Task7LoopsRecursion {
    /*
    Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int start =3;
        divideBy3(count, start);

    }

    static void divideBy3(int count, int start){
        if (count <1){
            return;
        }
        System.out.print(start +", ");

        divideBy3(count -1, start +3);
    }
}
