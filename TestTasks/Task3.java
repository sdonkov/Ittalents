public class Task3 {

    public static void main(String[] args) {

        /*
        Write a method that by given array of integers checks if the average value of the array
        is positive or negative. The method should return either “Positive”, “Non-positive” as a result
        (zero is non-positive). Use recursion!
         */
        int[] numbers = {1,5,3,3,1};
        System.out.println(checkAvg(numbers, 0, 0));

        /*
        Да се сметне при х и у, х на степен у, като се ползва само и единствено събиране.
         */

    }

    static String checkPositiveOrNegatives(int[] masiv, int i, int positives, int negatives){
        if(i == masiv.length){
            return positives > negatives ? "Positives are more" : "Negatives are more";
        }
        if(masiv[i] > 0){
            positives++;
        }
        else{
            negatives++;
        }
        return checkPositiveOrNegatives(masiv, i+1, positives, negatives);
    }

    static String checkAvg(int[] numbers, int sum, int i){
        if(i == numbers.length) {
            return sum / numbers.length > 0 ? "Positive" : "Non-positive";
        }
        sum += numbers[i];
        return checkAvg(numbers, sum, i+1);
    }
}
