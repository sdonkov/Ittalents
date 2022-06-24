import java.util.Scanner;

public class DopulnitelniTask6 {
    /*
    6. Да се създаде програма, която по предварително създадена променлива: suit, която може
да приема една от четирите бои, да отпечатва в конзолата символа на тази боя. ♣ т.н.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String suit = sc.nextLine();
        if(suit.equals("club")){
            System.out.println("\u2663");
        }else{
            if(suit.equals("spade")){
                System.out.println("\u2660");
            }else {
                if(suit.equals("diamond")){
                    System.out.println("\u2666");
                }else {
                    if(suit.equals("heart")){
                        System.out.println("\u2665");
                    }
                }
            }
        }
    }
}
