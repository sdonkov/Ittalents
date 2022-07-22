import java.util.Arrays;

public class DemoSudoku {

        public static void main(String[] args) {

            // should be (9x9)
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
            boolean isSolvedSudoku = true;
            int[] array = new int[9];

            for (int i = 0; i < 9; i+=3) {
                for (int j = 0; j < 9; j+=3) {

                    int m = 0;
                    for (int k = i; k < i+3; k++) {
                        for (int l = j; l < j+3; l++) {
                            array[m] = sudoku[k][l];
                            m++;
                        }
                    }

                    isSolvedSudoku = checkContentForSudoku(array);
                    if (!isSolvedSudoku) {
                        System.out.println("This is not correctly solved sudoku.");
                        return;
                    }

                }
            }

            for (int i = 0; i < 9; i++) {

                for (int j = 0; j < 9; j++) {
                    array[j] = sudoku[i][j];
                }

                isSolvedSudoku = checkContentForSudoku(array);
                if (!isSolvedSudoku) {
                    System.out.println("This is not correctly solved sudoku.");
                    return;
                }

            }

            for (int j = 0; j < 9; j++) {

                for (int i = 0; i < 9; i++) {
                    array[i] = sudoku[i][j];
                }

                isSolvedSudoku = checkContentForSudoku(array);
                if (!isSolvedSudoku) {
                    System.out.println("This is not correctly solved sudoku.");
                    return;
                }

            }

            System.out.println(isSolvedSudoku ? "This is correctly solved sudoku." : "");

        }

        static boolean checkContentForSudoku(int[] array) {
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
