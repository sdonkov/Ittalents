public class Task9 {
    /*
    9. Дадена е правоъгълна матрица с числа. Да се намери в нея
максималната подматрица с размер 2 х 2 и да се отпечата на
конзолата. Под максимална подматрица се разбира
подматрица, която има максимална сума на елементите, които я
съставят.
     */

    public static void main(String[] args) {
        int[][] matrix = {
                {7, 1, 8, 4, 3},
                {2, 6, 3, 8, 1},
                {6, 2, 4, 4, 5},
                {9, 0, 3, 2, 9}
        };

//        int subMatrixSum = 0;
        int maxSum = 0;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
               int subMatrixSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (i == 0 && j == 0) {
                    maxSum = subMatrixSum;
                } else {
                    if (subMatrixSum > maxSum) {
                        maxSum = subMatrixSum;
                        startRow = i;
                        startCol = j;
                    }
                }

            }
        }
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1] + " ");
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);

    }
}
