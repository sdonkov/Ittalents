import java.util.Scanner;

public class Task9OtUchebnika {
    /*
    програма която въвежда текст и извежда колко пъти е излозвана всяка буква от азбуката във въдения текст
    да изведе и буквата с най-много повторения
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        int count =1;
        int maxCount =0;
        char max = ' ';

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                for (int letter = i + 1; letter < text.length(); letter++) {
                    if (ch == text.charAt(letter)) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    max = ch;
                }
                if ((sb.indexOf(String.valueOf(ch)) == -1)) {
                    System.out.println(ch + " " + count);
                    count = 1;
                    sb.append(ch);
                }
                count = 1;
            }
        }
        System.out.println("Най-често се среща буквата: " + max);
    }
}
