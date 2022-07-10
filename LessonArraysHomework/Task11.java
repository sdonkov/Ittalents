import java.util.Scanner;

public class Task11 {
    /*
    Задача 11:
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        //entering array values
        for(int i =0; i< array.length; i++){
            System.out.println("Enter value:");
            array[i]= sc.nextInt();
        }
        int count = 0;
        for(int i =0; i <array.length; i++){
            if(array[i] > 5 && array[i] % 5 ==0){
                System.out.print(array[i] + " ");
                count++;
            }
        }
        if(count >0) {
                System.out.print("- "+ count + " numbers");
        }else {
            System.out.println("There are values bigger than 5 and divided by 5");
        }
    }
}
