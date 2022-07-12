public class Task6 {
    /*
    6. Напишете програма, която за дадена матрица от символи
отпечатва на екрана елементите, които се намират на главния
диагонал.
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 2, 3},
                {2, 4, 6, 7},
                {1,7, 0, 8},
                {3, 2, 9, 3}};

        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
    }
}
