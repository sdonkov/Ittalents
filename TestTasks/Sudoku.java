import java.util.Scanner;

public class Sudoku {
    /*
    is sudoku right
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 3, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
//        for(int row=0; row<sudoku.length; row ++){
//            for(int col=0; col<sudoku.length;col++){
//                System.out.println("Enter value for " + row + col);
//                sudoku[row][col] = sc.nextInt();
//            }
//        }
        System.out.println(isSolutionValid(sudoku, 0 ,0));
    }

    static boolean isSolutionValid(int[][] sudoku, int row, int col){
        if(row<0 || col <0 || row == sudoku.length || col == sudoku.length){
            return false;
        }

        int currentNum = sudoku[row][col];

        if(!(columnAvailable(sudoku,currentNum,row,col+1))){
            return false;
        }
        if(!(rowAvailable(sudoku,currentNum,row+1,col))){
            return false;
        }
        if(row==0 && col ==0 || row == 0 && col ==3 || row ==0 && col ==6 || row==3 && col ==0 ||
        row ==3 && col ==3 || row ==3 && col ==6 || row == 6 && col ==0 || row == 6 && col == 3||
        row == 6 && col ==6){
            if(!(subMatrixAvl(sudoku,currentNum,row,col))){
                return false;
            }
        }
        if(row == sudoku.length- 1 && col == sudoku[0].length - 1){
            return true;
        }
        return isSolutionValid(sudoku,row, col+1)||
                isSolutionValid(sudoku, row+1,col);
    }

    static boolean columnAvailable(int[][] sudoku, int currentNum, int row, int col){
        if(col == sudoku[0].length){
            return true;
        }
        if(currentNum == sudoku[row][col]){
            return false;
        }
        return columnAvailable(sudoku,currentNum,row,col+1);
    }

    static boolean rowAvailable(int[][] sudoku, int currentNum, int row,int col){
        if(row == sudoku.length){
            return true;
        }
        if(currentNum == sudoku[row][col]){
            return false;
        }
        return rowAvailable(sudoku,currentNum,row+1,col);
    }

    static boolean subMatrixAvl(int[][] sudoku,int currentNum,int row, int col){
        int[][] subMatrix = {
                {sudoku[row][col], sudoku[row][col+1], sudoku[row][col+2]},
                {sudoku[row+1][col],sudoku[row+1][col+1],sudoku[row+1][col+2]},
                {sudoku[row+2][col],sudoku[row+2][col+1],sudoku[row+2][col+2]}
        };
        for(int i =0; i <3; i++){
            for(int j =0;j<3; j++) {
                if (i == 0 && j == 0) {
                    j++;
                }
                if (currentNum == subMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
