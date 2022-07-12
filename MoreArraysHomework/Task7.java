public class Task7 {
    /*
    7. Напишете програма, която за дадена матрица намира
произведението на елементите под главния диагонал.
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 2, 3},
                {2, 4, 6, 7},
                {1,7, 0, 8},
                {3, 2, 9, 3}};

        int sum = 1;
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j < i; j++){
                sum *= matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
