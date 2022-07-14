import java.util.Scanner;

public class Task3 {
    /*
    Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text;
            System.out.println("Enter string without spaces separated with comma");
            text = sc.nextLine().split(",");

            if(text[0].length() > text[1].length()){
                System.out.println("String 1 is bigger");
            }else {
                if(text[1].length() > text[0].length()) {
                    System.out.println("String 2 is bigger");
                }else{
                    System.out.println("Strings are equal");
                }
            }
            String word1= text[0];
            String word2 = text[1];
            if(word1.length() > word2.length()){
                for(int i =0; i<word2.length(); i++){
                    if(word1.charAt(i) != word2.charAt(i)){
                        System.out.println(i+1 + " " + word1.charAt(i) + "-" + word2.charAt(i));
                    }
                }
            }else{
                for(int i =0; i<word1.length(); i++){
                    if(word1.charAt(i) != word2.charAt(i)){
                        System.out.println(i+1 + " " + word1.charAt(i) + "-" + word2.charAt(i));
                    }
                }
            }
    }
}
