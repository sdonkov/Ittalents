import java.util.Arrays;

public class Task3SledUroka {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int rowForMagic = 0;
        int colForMagic = 0;

        int oneMoreCol = 0;

        int[][] magicMatrix = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                column = 0;
                colForMagic = matrix[row].length - 1;
                if (row == 0) {
                    for (int i = 0; i < matrix[row].length; i++) {
                        magicMatrix[rowForMagic][colForMagic] = matrix[row][oneMoreCol];
                        rowForMagic++;
                        oneMoreCol++;
                    }
                    rowForMagic = 0;
                    row++;
                    colForMagic--;
                    oneMoreCol = 0;
                }
                if (row == 1) {
                    for (int i = 0; i < matrix[row].length; i++) {
                        magicMatrix[rowForMagic][colForMagic] = matrix[row][oneMoreCol];
                        rowForMagic++;
                        oneMoreCol++;
                    }
                    oneMoreCol = 0;
                    colForMagic--;
                    rowForMagic = 0;
                    row++;
                }
                if (row == 2) {
                    for (int i = 0; i < matrix[row].length; i++) {
                        magicMatrix[rowForMagic][colForMagic] = matrix[row][oneMoreCol];
                        rowForMagic++;
                        oneMoreCol++;
                    }
                    colForMagic--;
                    oneMoreCol = 0;
                    rowForMagic = 0;
                    row++;
                }
                for (int i = 0; i < matrix[row].length; i++) {
                    magicMatrix[rowForMagic][colForMagic] = matrix[row][oneMoreCol];
                    rowForMagic++;
                    oneMoreCol++;
                }
                break;

            }
            for (int i = 0; i < magicMatrix.length; i++) {
                for (int j = 0; j < magicMatrix[i].length; j++) {
                    System.out.print(magicMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}