import java.util.Arrays;
import java.util.Scanner;

public class Demo10 {
    /*
    Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.next();
//        newWord(word);
        for(int idx = 0; idx<word.length(); idx++){
            char newWord = (char) (word.charAt(idx) + 5);
            System.out.print(newWord);
        }

    }

//    static void newWord(String word){
//        String[] word1 = new String [word.length()];
//        for(int i =0; i <word.length();i++){
//            word1[i] = word.charAt(i)+"";
//        }
//        for(int i =0; i<word1.length; i++){
//            word1[i] = word1[i] + 5;
//        }
//        System.out.println(Arrays.toString(word1));
//    }
}
