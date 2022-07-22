import java.util.Arrays;

public class SudokuLoop {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        int[] array= new int[9];
        boolean sudokuIsValid = true;

        // check row
        for(int i =0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                array[j] = sudoku[i][j];
            }
            sudokuIsValid = checkCurrentNums(array);
            if (!sudokuIsValid) {
                sudokuIsValid = false;
                System.out.println("Not valid solution");
                return;
            }
        }
        //check col
        for(int i=0; i <array.length;i++){
            for(int j =0; j<array.length; j++){
                array[j] = sudoku[j][i];
            }
            sudokuIsValid = checkCurrentNums(array);
            if(!sudokuIsValid){
                sudokuIsValid =false;
                System.out.println("Not valid solution");
                return;
            }
        }

        //check sub matrix 3x3
        for(int i =0; i<array.length; i+=3){
            for(int j =0; j < array.length; j +=3){
                int x =0;
                for(int secondLoop = i; secondLoop <i +3; secondLoop++){
                    for(int thirdLoop = j; thirdLoop<j+3; thirdLoop++){
                        array[x] = sudoku[secondLoop][thirdLoop];
                        x++;
                    }
                }
                sudokuIsValid = checkCurrentNums(array);
                if(!sudokuIsValid){
                    sudokuIsValid = false;
                    System.out.println("Not valid solution");
                    return;
                }
            }
        }
        System.out.println(sudokuIsValid ? "Valid solution": "Not valid solution");

        }

        static boolean checkCurrentNums(int[] array) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int min;
        int indexOfMin;

        for (int i = 0; i < 9; i++) {
            min = array[i];
            indexOfMin = i;
            for (int j = i+1; j < 9; j++) {
                if (min > array[j]) {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            if (min != array[i]) {
                int x = array[i];
                array[i] = array[indexOfMin];
                array[indexOfMin] = x;
            }
        }

        if (Arrays.equals(array, a)) {
            return true;
        }
        else {
            return false;
        }
    }
    }
