import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {
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
        System.out.println("Enter text:");
        String[] wordsArray = sc.nextLine().split(" ");
        String currentWord;
        String upperChar;

        for(int i =0; i < wordsArray.length; i++){
             currentWord =wordsArray[i];
             upperChar = currentWord.charAt(0) + "";
            System.out.print(upperChar.toUpperCase() + currentWord.substring(1) + " ");

        }


    }
}
