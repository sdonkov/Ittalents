import java.util.Scanner;

public class Task10 {
    /*
    Задача 10:
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        double sum = 0;
        for(int i=0; i<array.length; i++){
            System.out.println("Enter value");
            array[i] = sc.nextInt();
            sum+= array[i];
        }
        double srednoAritmetichno = sum / array.length;
        System.out.println(srednoAritmetichno);
        double result;
        double min = array[0];
        double value = 0;

        for(int i =0; i< array.length; i++) {
            if (array[i] - srednoAritmetichno < 0) {
                result = -(array[i] - srednoAritmetichno);
                if (min > result) {
                    min = result;
                    value = array[i];
                }
            } else {
                result = array[i] - srednoAritmetichno;
                if (min > result) {
                    min = result;
                    value = array[i];
                }
            }
        }
        System.out.println(value);
    }
}
