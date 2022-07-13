import java.util.Scanner;

public class Task8OtUchebnika {
    /*
    приемат се два символни низа (string)
    всички букви в първия низ трябва да са различни (неповтарящи се)
    да се изведе дали двата низа съдържат изцяло еднакви букви
    и ако не кои букви от първия низ не се срещат във втория
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        boolean differentLetters = true;

        do{
            System.out.println("Enter first word:");
            text = sc.next();
             differentLetters = true;
        for(int i =0; i< text.length();i++){
            char ch = text.charAt(i);
            if(text.indexOf(ch, text.indexOf(ch) +1) > -1){
                differentLetters = false;
            }
        }
        }while(!differentLetters);
            System.out.println("Enter second word:");
            String text2 = sc.next();

            boolean allCharAreTheSame = true;
            if(text.length() != text2.length()){
                allCharAreTheSame = false;
            }
            for(int i =0; i<text.length(); i++) {
                char ch = text.charAt(i);
                if (!(text2.contains(String.valueOf(ch)))) {
                    allCharAreTheSame = false;
                    System.out.print(text.charAt(i) +" ");
                }
            }
        System.out.println();
        System.out.println(allCharAreTheSame? "Съдържат еднакви букви" : "Не съдържат еднакви букви");
    }
}
