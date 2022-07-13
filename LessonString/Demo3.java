import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words separated with coma: ");
        String words = sc.next();

        String[] wordsArray = words.split(",");

        String firstWord = wordsArray[0];
        String secondWord = wordsArray[1];

//        System.out.println(firstWord);
//        System.out.println(secondWord);

        differences(firstWord,secondWord);


//        System.out.println(firstWord.compareTo(secondWord));

    }

    static void differences(String word1, String word2){
        if(word1.length() == word2.length()){
            System.out.println("The strings are with equal length");
        }else {
            if (word1.length() > word2.length()) {
                System.out.println("First string is longer");
            }else{
                System.out.println("Second string is longer");
            }
        }
        System.out.println("Positions differences");
        for(int i =0; i<word1.length();i++){
            if(word1.charAt(i) != word2.charAt(i)){
                System.out.println(i + 1 + " " + word1.charAt(i) + "-" + word2.charAt(i));
            }
        }
    }
}
