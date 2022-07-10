import java.util.Scanner;

public class Task15 {
    /*
    Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
 --- трите най-големи различни числа по абсолютна стойност
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter array length (min-3): ");
            arrayLen = sc.nextInt();
        } while (arrayLen < 3);

        double[] array = new double[arrayLen];

        for(int i =0; i<array.length; i++){
            System.out.println("Enter value");
            array[i] = sc.nextDouble();
        }

        double[] copy = new double[array.length];

        for(int i=0; i<array.length; i++){
            copy[i] = array[i] <0 ? -array[i] : array[i];
        }
        double max1 = -1;
        double max2 = -1;
        double max3 = -1;
        int idx1= 0;
        int idx2=0;
        int idx3=0;
        for(int i =0; i<copy.length; i++){
            if(copy[i] > max1){
                max1 = copy[i];
                idx1=i;
            }
        }
        for(int i =0; i<copy.length; i++){
            if(copy[i] > max2 && copy[i] < max1){
                max2 = copy[i];
                idx2=i;
            }
        }
        for(int i =0; i<copy.length; i++){
            if(copy[i] > max3 && copy[i] < max2){
                max3 = copy[i];
                idx3=i;
            }
        }
        System.out.println(array[idx1]);
        System.out.println(array[idx2]);
        System.out.println(array[idx3]);
    }
}
