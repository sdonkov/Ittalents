public class Task11a {
    public static void main(String[] args) {
        int n = 4;
        int m =5;

        int[][] matrix = new int[n][m];
        int startNum=10;

        for(int i =0; i < matrix.length; i++){
            for(int j =0; j<matrix[i].length;j++){
                matrix[i][j] = startNum++;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
