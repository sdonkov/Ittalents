import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = sc.next();
        System.out.println("Enter second word: ");
        String secondWord = sc.next();

        printResult(firstWord, secondWord);
    }

    static void printResult(String word1, String word2){
        // check if there is common char
        boolean commonChar = false;
        int firstWordIndex=-1;
        int secondWordIndex=-1;
        char lookedChar = ' ';


        if(word1.length() < word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                if (word1.contains("" + word2.charAt(i))) {
                    secondWordIndex = i;
                    lookedChar = word2.charAt(i);
//                    firstWordIndex = word1.indexOf(lookedChar);
                    commonChar = true;
                    break;
                }
            }
        }else{
            for(int j =0; j <word1.length(); j++){
                if(word2.contains("" + word1.charAt(j))){
                    secondWordIndex = j;
                    lookedChar = word1.charAt(j);
                    commonChar = true;
                    break;
                }
            }
        }
        boolean printCommon = false;
        int spaces = 0;
        if(commonChar){
            for(int i =0; i<word1.length(); i++){
                if(word1.charAt(i) == lookedChar && !printCommon){
                    System.out.println(word2);
                    printCommon= true;
                }else{
                        while(spaces < secondWordIndex){
                            System.out.print(" ");
                            spaces++;
                        }
                        spaces=0;
                    System.out.println(word1.charAt(i));
                }
            }
        }else{
            System.out.println("No common char... sorry");
        }
    }
}
