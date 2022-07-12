public class Task11c {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        int[][] matrix = new int[n][m];
        int startNum = 10;

        int startRow = 0;
        int startCol = 0;
        int currentCol = 0;
        int currentRow =0;


        for(int i =0; i < n*m; i++){
            matrix[currentRow][currentCol] = startNum++;
            currentRow--;
            currentCol++;
            if(currentRow < 0 || currentCol == m){
                startRow++;
                if(startRow == n){
                    startRow--;
                    startCol++;
                }
                currentRow = startRow;
                currentCol = startCol;
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
