import java.util.Scanner;

public class Task8 {
    /*
    Задача 8:
Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String text = sc.next();
        isPalindrome(text);
    }

    static void isPalindrome(String text){
        boolean isPalindrome =true;
        for(int i =0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length() -1 -i)){
                isPalindrome = false;
            }

        }
        System.out.println(isPalindrome?"да.":"не.");
    }
}
