import java.util.Scanner;

public class ExamTask1Krasi {
    /*
    Write a program that reads five characters separated by space – each one – the
    strength of a card. Possible inputs are from 2..9 or T, J, Q, K, A. If the input is invalid the
    program must output the following: “Invalid cards given!”. The inputs are infinite. The
    program must stop when 4 consecutive packs with a pair are dealt. A pack with a pair is a
    group of five cards where there is at least one card that is dealt twice. Finally, the program
    must print the number of tries.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCounts = 0;
        int pairsCount = 0;

//        char[] valid = {'2','3','4','5','6','7','8','9','T','J','Q','K','A',' '};
        String validCards ="23456789TJQKA";
        while(true){
            String dealt = sc.nextLine();
            totalCounts++;
            if(dealt.length() != 9){
                System.out.println("Invalid cards given!");
                pairsCount=0;
                continue;
            }
            String[] cards = dealt.split(" ");
            boolean validInput = true;
            boolean pair = false;
            for(int i =0; i < cards.length; i++){
                if(!validCards.contains(cards[i])){
                    System.out.println("Invalid cards given");
                    pairsCount = 0;
                    validInput = false;
                    break;
                }
            }
            if(validInput){
                for(int i =0; i < cards.length; i ++){
                    for(int j = i +1; j< cards.length; j++){
                        if(cards[i].equals(cards[j]) && !pair) {
                            pairsCount += 1;
                            pair = true;
                        }
                    }
                }
            }
            if(!pair){
                pairsCount = 0;
            }
            if(pairsCount == 4){
                System.out.println(totalCounts);
                break;
            }
        }
    }
}
