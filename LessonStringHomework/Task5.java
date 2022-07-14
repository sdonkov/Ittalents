import java.util.Scanner;

public class Task5 {
    /*
    Задача 5:
Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = sc.next();
        System.out.println("Enter second word");
        String secondWord = sc.next();
        int firstWordIndex = index(firstWord, secondWord);
        if(firstWordIndex != -1){
            printResult(firstWord, secondWord, firstWordIndex);
        }else{
            System.out.println("No common chars");
        }

    }

    static int index(String firstWord, String secondWord){
        int firstWordIndex = -1;
        for(int i =0; i<firstWord.length(); i++){
            // char c = firstWord.charAt(i);
            // String s = String.valueOf(c);
            //if(secondWord.contains(s))

            if(secondWord.contains(firstWord.charAt(i)+"")){
                firstWordIndex = i;
                return firstWordIndex;
            }
        }
        return firstWordIndex;
    }


    static void printResult(String word1, String word2, int word1CommonIndex){
        int word2CommonIndex = word2.indexOf(word1.charAt(word1CommonIndex));
        for(int i =0; i <word2.length(); i++){
            if(word2CommonIndex == i ){
                System.out.println(word1);
            }else{
                for(int spaces=0; spaces<word1CommonIndex; spaces++){
                    System.out.print(" ");
                }
                System.out.println(word2.charAt(i));
            }
        }
    }
}


