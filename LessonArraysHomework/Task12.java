import java.util.Scanner;

public class Task12 {
    /*
    Задача 12:
Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.
Пример: 1,2,3,4,5,6,7
Изход: 2,1,4,3,6,5,7
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7};


        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
