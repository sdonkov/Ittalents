public class Ohliov {
    public static void main(String[] args) {
        int n =5;
        int m =5;
        int startNum = 1;
        int[][] matrix = new int [n][m];

        char posoka ='r';
        int i=0;
        int j =0;


        for(int k = 0; k < n*m; k++) {
                switch (posoka){
                case 'r':
                matrix[i][j] =startNum++;
                j++;
                if(j == m -1 || matrix[i][j+1] !=0){
                    posoka ='d';
                }break;
                case 'l':
                    matrix[i][j] = startNum++;
                    j--;
                    if(j <= 0 || matrix[i][j-1] != 0){
                        posoka = 'u';
                    }break;

                case 'u':
                    matrix[i][j] = startNum++;
                    i--;
                    if(i <= 0 || matrix[i-1][j] !=0){
                        posoka = 'r';
                    }break;
                case 'd':
                    matrix[i][j]= startNum++;
                    i++;
                    if(i == n - 1 || matrix[i+1][j] !=0){
                        posoka = 'l';
                    }break;
        }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
