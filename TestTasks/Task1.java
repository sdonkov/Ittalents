import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*
            Да се прочетат хвърляния на два зара. Да се броят и да се изведата, когато
            последователно се хвърлят 5 пъти такива зарове, че сборът им да е 7.
         */

        /*
            Да се прочита хвърляне на монета и да се спра, когато се хвърлят 10 последователни езита
         */

//        while(true) {
//            int zar1 = sc.nextInt();
//            int zar2 = sc.nextInt();
//
//            if(!(zar1 >= 1 && zar1 <= 6 && zar2 >= 1 && zars <= 6)){
//                continue;
//            }
//            tries++;
//            if(zar1 + zar2 == 7){
//                counter++;
//                if(counter == 5){
//                    return tries;
//                }
//            }
//            else{
//                counter = 0;
//            }
//        }

        /*
        Write a program that reads five characters separated by space – each one – the
        strength of a card. Possible inputs are from 2..9 or T, J, Q, K, A. If the input is invalid the
        program must output the following: “Invalid cards given!”. The inputs are infinite. The
        program must stop when 4 consecutive packs with a pair are dealt. A pack with a pair is a
        group of five cards where there is at least one card that is dealt twice. Finally, the program
        must print the number of tries.
         */

        /*
        6 6 A A T
        while(true){
            read a hand -> string, split by space -> 5 strings that are the cards
            validate hand -> check if all 5 strings are in this range. If not -> Invalid cards given
            check for pair -> if true -> increment a counter. if false -> nullify the counter
        }
         */

        Scanner sc = new Scanner(System.in);
        int tries = 0;
        int consecutivePairs = 0;
        while (true){
            String hand = sc.nextLine();
            String[] cards = hand.split(" ");

            if(!validHand(cards)){
                System.out.println("Invalid cards given");
                continue;
            }
            tries++;
            if(hasPair(cards)){
                consecutivePairs++;
                if(consecutivePairs == 4){
                    System.out.println(tries);
                    break;
                }
            }
            else{
                consecutivePairs = 0;
            }
        }
    }

    static boolean hasPair(String[] cards){
        //4 4 3 7 A
        for (int i = 0; i < cards.length; i++) {
            String target = cards[i];
            for (int j = i+1; j < cards.length ; j++) {
                if(target.equals(cards[j])){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean validHand(String[] cards){
        // 2..9 or T, J, Q, K, A
        if(cards.length != 5){
            return false;
        }
        String validSymbols = "23456789TJQKA";
        for (int i = 0; i < cards.length; i++) {
            String card = cards[i];
            if(!(validSymbols.contains(card.toUpperCase())) || card.length() != 1){
                return false;
            }
        }
        return true;
    }
}
