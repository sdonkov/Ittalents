public class DemoTask4 {
    public static void main(String[] args) {

        int[][] twoDArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                System.out.print(twoDArray[twoDArray[row].length - 1 - col][row] + " ");
            }
            System.out.println();
        }
    }
}