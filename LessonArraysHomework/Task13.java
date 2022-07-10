import java.util.Scanner;

public class Task13 {
    /*
    Задача 13:
Да се състави програма, чрез която се въвежда число и се представя
като число в двоична бройна система.
Програмата, чрез масив, да изчислява последователно всички цифри
на въведеното естествено число в 2-ична бройна система.
Пример: 99
Изход: 1100011
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number");
            num = sc.nextInt();
        }while(num<1);
        int count=0;

        int temp = num;
        while(temp>0){
            count++;
            temp = temp /2;
        }
        int[] array = new int[count];
        int ostatuk;
        for(int i = array.length-1; i>=0; i--){
            ostatuk = num%2;
            array[i] = ostatuk;
            num = num/2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
