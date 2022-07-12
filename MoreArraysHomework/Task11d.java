public class Task11d {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        int[][] matrix = new int[n][m];
        int startNum = 1;

        for(int col=0; col < matrix[0].length;col++){
            if(col % 2 ==0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNum++;
                }
            }
            else{
                for(int row = matrix.length -1; row>=0; row--){
                    matrix[row][col] = startNum++;
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
