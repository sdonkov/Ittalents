import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    /*
    Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.next();
        String[] nums = text.split("-[0-9]+");
        System.out.println(Arrays.toString(nums));
        int[] digits = {1,2,3,4,5,6,7,8,9,0};
        for(int i =0; i< nums.length; i++){
        }
    }
}
