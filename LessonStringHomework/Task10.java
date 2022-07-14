import java.util.Scanner;

public class Task10 {
    /*
    Задача 10:
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
        System.out.println("Enter string");
        String text = sc.next();
        magic(text);
    }

    static void magic(String text){
        char[] firstArr = new char[text.length()];
        for(int i =0; i<text.length();i++){
            firstArr[i] = (char) (text.charAt(i) + 5);
        }
        System.out.println(firstArr);

    }
}
