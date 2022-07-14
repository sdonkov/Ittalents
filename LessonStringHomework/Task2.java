import java.util.Scanner;

public class Task2 {
    /*
    Задача 2:
Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1;
        String word2;
        do{
            System.out.println("Enter first word");
            word1= sc.next();
            System.out.println("Enter second word");
            word2 = sc.next();
        }while(word1.length() <10 || word1.length() >20 || word2.length() <10
    || word2.length() > 20);

        String word3 = word2.substring(0,5) + word1.substring(5);

        int biggerWord = word1.length() > word2.length() ? word1.length() : word2.length();

        System.out.println(biggerWord + " " + word3);
    }
}
