public class OtZadachite11c {
    public static void main(String[] args) {

        int n =4;
        int m =5;

        int[][] matrix = new int[n][m];

        int a=1;

        int i =0;
        int j =0;
        int startI = 0;
        int startJ = 0;

        for(int k =0; k< n * m; k++){
            matrix[i][j] = a++;
            i--;
            j++;
            if(i< 0 || j == m){
                startI++;
                if(startI ==n){
                    startI--;
                    startJ++;
                }
                i = startI;
                j = startJ;
            }
        }
        for (int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
