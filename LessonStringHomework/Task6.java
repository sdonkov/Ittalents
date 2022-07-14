import java.util.Scanner;

public class Task6 {
    /*
    Задача 6:
Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your words: ");
        String[] arr = sc.nextLine().split(" ");
        for(int i =0; i< arr.length;i++){
            String word = arr[i];
            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ");
        }
    }
}
