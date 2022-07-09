public class DemoIgriSPametta {
        public static void main(String[] args) {
            int x =5;
            int[] masiv = {3,6,2};
            int[][] table = {masiv,masiv, {25,6,4}};
            table[0][0] = x + masiv[1];
            table[0][1] = table[2][0] + masiv[0];
            table[1] = table[2];
//        masiv = table[2];
            System.out.println(masiv[0] + table[0][0] + table[0][1] + table[1][1]);
        }
}

