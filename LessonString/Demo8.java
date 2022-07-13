import java.util.Scanner;

public class Demo8 {
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
        System.out.println("Enter word: ");
        String word = sc.next();
        System.out.println(isReversed(word) ? "да" : "не");

    }

    static boolean isReversed(String word){
        for(int i =0; i<word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
