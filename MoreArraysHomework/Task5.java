public class Task5 {
    /*
    5. Напишете програма, която за дадена матрица m x n от числа
намира реда, в който сумата от елементите е максимална.

     */
    public static void main(String[] args) {


        int[][] matrix = {
                {-1, -5, -222, 3},
                {2, -4, -6, 7},
                {1,-7, 0, -9},
                {3, -2, -9, -3}};
        int maxRow = 0;
        int maxSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                rowSum += matrix[row][col];
            }
            if (row == 0) {
                maxSum = rowSum;
            } else {
                if (maxSum < rowSum) {
                    maxSum = rowSum;
                    maxRow = row;
                }
            }
        }
        System.out.println(maxRow);
    }
}