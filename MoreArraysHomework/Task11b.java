public class Task11b {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        int[][] matrix = new int[n][m];
        int startNum = 1;

        for(int j =0; j<matrix[0].length;j++) {
            for (int i = 0; i < matrix.length; i++) {
                {
                    matrix[i][j] = startNum++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}