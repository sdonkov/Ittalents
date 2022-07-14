import java.util.Scanner;

public class Task1 {
    /*
    Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh

     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text;
        String text2;
        do{
            System.out.println("Enter string");
            text = sc.next();
            System.out.println("Enter second string");
            text2 = sc.next();
        }while(text.length() >40 || text2.length() > 40);

        System.out.print(text.toUpperCase() + " " + text.toLowerCase() + " ");
        System.out.println(text2.toUpperCase() + " " + text2.toLowerCase());
    }

}
