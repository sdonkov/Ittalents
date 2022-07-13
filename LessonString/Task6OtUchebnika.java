import java.util.Scanner;

public class Task6OtUchebnika {
    /*
    Да се състави програма, която при въведен текст и въведен символ
    да отпечатва колко пъти се среща символът в текста.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String[] textArr = sc.nextLine().split(" ");
        System.out.println("Enter symbol: ");
        char ch = sc.next().charAt(0);
        int count =0;
        String currentWord;
        for(int i =0; i< textArr.length; i++){
            currentWord = textArr[i];
            for(int idx = 0; idx<currentWord.length(); idx++){
                if(currentWord.contains(String.valueOf(ch))){
                    count++;
                }
            }

        }
        System.out.println(count);


    }
}
