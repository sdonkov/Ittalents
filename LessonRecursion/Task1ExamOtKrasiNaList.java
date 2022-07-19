import java.util.Scanner;

public class Task1ExamOtKrasiNaList {
    public static void main(String[] args) {

        int totalCounter =0;
        int pairsCounter = 0;

        while(true){
            Scanner sc = new Scanner(System.in);
            String startText = sc.nextLine();

            if(!validCards(startText)){
                System.out.println("Invalid cards given");
            }else{
                totalCounter++;
                if(hasPair(startText)){
                    pairsCounter++;
                    if(pairsCounter ==4) {
                        System.out.println(totalCounter);
                        break;
                    }
                    }else{
                    pairsCounter =0;
                }
            }
        }
    }

    static boolean validCards(String startCards){
        String[] cards = startCards.split(" ");
        if(cards.length != 5){
            return false;
        }
        for(int i =0; i <cards.length;i++){
            if(!(cards[i].equals("2")||cards[i].equals("3")|| cards[i].equals("4") || cards[i].equals("5")
        || cards[i].equals("6")|| cards[i].equals("7") || cards[i].equals("8") || cards[i].equals("9")||
            cards[i].equalsIgnoreCase("T") || cards[i].equals("J")|| cards[i].equals("Q")
            || cards[i].equals("K") || cards[i].equals("A"))){
                return false;
            }
        }
        return true;
    }
    static boolean hasPair(String startCards){
        String[] cards = startCards.split(" ");
        for(int i =0;i<cards.length;i++){
            for(int j =i +1;j< cards.length; j++){
                if(cards[i].equals(cards[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
