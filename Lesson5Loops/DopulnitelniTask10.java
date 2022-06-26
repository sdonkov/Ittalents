import java.util.Scanner;

public class DopulnitelniTask10 {
    /*
    10. Да се състави програма, която приема число N в интервала [1..52]. Това число отговаря на
номер на карта от наредено тесте с карти, като в тестето подредбата е следната:
Наредба по тежест на карта: 2, 3, 4, 5, 6, 7, 8, 9, 10, Вале, Дама, Поп, Асо.
Наредба по цвят на картите: спатия, каро, купа, пика.
Картите са подредени по следния начин: първо двойките от четирите бои, после тройките,
после четворките , и т.н. Програмата да извежда картата, която съответства на въведения
номер.
/Опитайте да намерите зависимост и да решите задачата без писането на 52 if statement-a/
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Input a number between 1 and 52");
            num = sc.nextInt();
        }while(num<1 || num>52);
        int ostatuk;
        String suit;
        int card;
        ostatuk = num %4;
        switch (ostatuk) {
            case 0:
                suit = "pika";
                card = (num / 4) + 1;
                if(card<11){
                    System.out.println(card + " " + suit);
                    break;
                }
                switch (card) {
                    case 11 -> System.out.println("Vale pika");
                    case 12 -> System.out.println("Dama pika");
                    case 13 -> System.out.println("Pop pika");
                    case 14 -> System.out.println("Aso pika");
                }
            case 1:
                card = (num /4) +2;
                suit = "spatiq";
                if (card<11) {
                    System.out.println(card + " " + suit);
                    break;
                }
                switch (card) {
                    case 11 -> System.out.println("Vale spatiq");
                    case 12 -> System.out.println("Dama spatiq");
                    case 13 -> System.out.println("Pop spatiq");
                    case 14 -> System.out.println("Aso spatiq");
                }
            case 2:
                card = (num /4) + 2;
                suit = "karo";
                if (card<11) {
                    System.out.println(card + " " + suit);
                    break;
                }
                switch (card){
                    case 11 -> System.out.println("Vale karo");
                    case 12 -> System.out.println("Dama karo");
                    case 13 -> System.out.println("Pop karo");
                    case 14 -> System.out.println("Aso karo");
                }
            case 3:
                card = (num /4) +2;
                suit = "kupa";
                if(card <11){
                    System.out.println(card + " " +suit);
                    break;
                }
                switch (card){
                    case 11 -> System.out.println("Vale kupa");
                    case 12 -> System.out.println("Dama kupa");
                    case 13 -> System.out.println("Pop kupa");
                    case 14 -> System.out.println("Aso kupa");
                }
        }

    }
}
