import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstText;
        do{
            System.out.println("Enter first word: ");
            firstText = sc.next();
        }while(firstText.length() > 20 || firstText.length() < 10);
        String secondWord;
        do {
            System.out.println("Enter second word: ");
            secondWord = sc.next();
        }while (secondWord.length()>20 || secondWord.length() < 10);

        int biggerWordLength = biggerWord(firstText, secondWord);

        System.out.print(biggerWordLength + " ");

        String newWord = mixingWords(firstText,secondWord);
        System.out.println(newWord);

    }

    static int biggerWord(String word1, String word2){
        if(word1.length() > word2.length()){
            return word1.length();
        }else{
            return word2.length();
        }
    }

    static String mixingWords(String word1, String word2){
        return word2.substring(0,5) + word1.substring(5);
    }

}
